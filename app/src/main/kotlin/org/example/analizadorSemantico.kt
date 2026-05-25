// AnalizadorSemantico.kt
// Este archivo recorre el árbol de parseo generado por ANTLR4 usando el patrón Visitor.
// Por cada regla importante de la gramática (programa, variables, funciones) 
// tiene un método override que se ejecuta automáticamente cuando ANTLR4 llega a ese nodo.
// ctx (context) es el objeto que contiene toda la información que ANTLR4 reconoció en esa regla.
// Llena el DirectorioFunciones con las funciones y variables del programa.

package org.example

class AnalizadorSemantico : PatitoBaseVisitor<Unit>() {

    val directorio = DirectorioFunciones()

    // Pilas y lista de cuádruplos
    val pilaOperandos  = PilaOperandos()
    val pilaTipos      = PilaTipos()
    val pilaOperadores = PilaOperadores()
    val cuadruplos     = ListaCuadruplos()

    // Contador de temporales (T1, T2, etc)
    private var contadorTemp = 0
    private fun nuevoTemp(): String = "t${++contadorTemp}"

    private var funcionActual = "global" // Para saber en qué función estamos al declarar variables

    //1. Cuando encuentra: programa miProg;
    //ctx.ID() devuelve el token ID que ANTLR4 reconoció, y .text obtiene el texto del token (el nombre del programa)
    //Agrega el programa al directorio como una función con tipo de retorno NULA (porque no tiene return)
    //Luego visita los hijos del nodo programa (vars, func, etc) para seguir llenando el directorio
    override fun visitPrograma(ctx: PatitoParser.ProgramaContext) {
        val nombre = ctx.ID().text 
        println("Programa encontrado: $nombre")
        directorio.agregarFuncion(nombre, Tipo.NULA)
        funcionActual = nombre
        visitChildren(ctx)
    }

    //2. Cuando encuentra la sección vars — recorre todas las declaraciones
    // ctx.listaVars() devuelve el primer nodo listaVars, y luego se va recorriendo cada listaVars hija hasta que no haya más
    override fun visitVars(ctx: PatitoParser.VarsContext) {
        var listaVars = ctx.listaVars()
        while (listaVars != null) {
            visitListaVars(listaVars)
            listaVars = listaVars.listaVars()
        }
    }

    //2.1 Cuando encuentra: x, y : entero;
    // ctx.tipo() devuelve el nodo tipo, y .text obtiene el texto del tipo (entero o flotante)
    // Luego recorre la lista de IDs (x, y) y las agrega al directorio con su tipo correspondiente
    override fun visitListaVars(ctx: PatitoParser.ListaVarsContext) {
        val tipo = when (ctx.tipo().text) {
            "entero"   -> Tipo.ENTERO
            "flotante" -> Tipo.FLOTANTE
            else       -> Tipo.ERROR
        }

        var listaIds = ctx.listaIds()
        while (listaIds != null) {
            val nombreVar = listaIds.ID().text
            println("Variable encontrada: $nombreVar : $tipo en $funcionActual")
            directorio.agregarVariable(funcionActual, nombreVar, tipo)
            listaIds = if (listaIds.childCount > 1) listaIds.listaIds() else null
        }
    }

    //3. Cuando encuentra una función
    // ctx.ID(0) devuelve el primer token ID que ANTLR4 reconoció (el nombre de la función)
    // Agrega la función al directorio con tipo de retorno NULA (porque no se especifica en la gramática)
    // Luego visita los hijos del nodo función para seguir llenando el directorio con sus variables locales
    override fun visitFunc(ctx: PatitoParser.FuncContext) {
        val nombre = ctx.ID(0).text
        println("Función encontrada: $nombre")
        directorio.agregarFuncion(nombre, Tipo.NULA)
        val funcionAnterior = funcionActual
        funcionActual = nombre
        visitChildren(ctx)
        funcionActual = funcionAnterior
    }
    
    //Cuando encuentra un factor (parte de una expresión)
    // Puede ser una variable (ID), una constante entera (CTE_ENT) o una constante flotante (CTE_FLOT)
    // Si es una variable, busca su tipo en el directorio y lo agrega a la pila de tipos, junto con su nombre a la pila de operandos
    // Si es una constante, agrega su tipo (ENTERO o FLOTANTE) a la pila de tipos, y su valor a la pila de operandos
     
    override fun visitFactor(ctx: PatitoParser.FactorContext) {
        if (ctx.ID() != null) {
            val nombre = ctx.ID().text
            val info = directorio.buscarVariable(funcionActual, nombre)
            if (info != null) {
                pilaOperandos.push(nombre)
                pilaTipos.push(info.tipo)
            }
        } else if (ctx.cte()?.CTE_ENT() != null) {
            pilaOperandos.push(ctx.cte().CTE_ENT().text)
            pilaTipos.push(Tipo.ENTERO)
        } else if (ctx.cte()?.CTE_FLOT() != null) {
            pilaOperandos.push(ctx.cte().CTE_FLOT().text)
            pilaTipos.push(Tipo.FLOTANTE)
        } else {
            visitChildren(ctx)
        }
    }
    // Cuando encuentra una multiplicación o división
    // empuja el operador y genera el cuádruplo
        /*
        Entero * Entero = Entero
        Entero * Flotante = Flotante
        Flotante * Entero = Flotante
        Flotante * Flotante = Flotante
    
        Entero / Entero = Entero
        Entero / Flotante = Flotante
        Flotante / Entero = Flotante   
        */
    override fun visitTermino(ctx: PatitoParser.TerminoContext) {
        if (ctx.termino() != null) {
            visitTermino(ctx.termino())
            val op = if (ctx.MULT() != null) "*" else "/"
            pilaOperadores.push(op)
            visitFactor(ctx.factor())
            generarCuadruplo()
        } else {
            visitFactor(ctx.factor())
        }
    }
    // funcion suma y resta (similar a multiplicación y división)
        /*
        Entero + Entero = Entero
        Entero + Flotante = Flotante
        Flotante + Entero = Flotante
        Flotante + Flotante = Flotante

        Entero - Entero = Entero
        Entero - Flotante = Flotante
        Flotante - Entero = Flotante
        Flotante - Flotante = Flotante
         */

    override fun visitExp(ctx: PatitoParser.ExpContext) {
        if (ctx.exp() != null) {
            // Procesa la expresión izquierda recursivamente
            visitExp(ctx.exp())
            
            // Determina si es suma o resta y lo empuja a la pila de operadores
            val op = if (ctx.SUMA() != null) "+" else "-"
            pilaOperadores.push(op)
            
            // Procesa el término (factor con multiplicaciones/divisiones)
            visitTermino(ctx.termino())
            
            // Genera el cuádruplo correspondiente a la operación
            generarCuadruplo()
        } else {
            // Caso base: solo hay un término, sin operaciones de suma/resta
            visitTermino(ctx.termino())     
        }
    }

    // Funcion para cuando encuentra una expresión relacional (comparación)

    override fun visitExpresion(ctx: PatitoParser.ExpresionContext) {
        if (ctx.opRel() != null) {
            // Procesa el lado izquierdo
            visitExp(ctx.exp(0))
            
            // Obtiene el operador relacional
            val op = ctx.opRel().text
            pilaOperadores.push(op)
            
            // Procesa el lado derecho
            visitExp(ctx.exp(1))
            
            // Genera el cuádruplo
            generarCuadruplo()
        } else {
            // Solo es una expresión aritmética, no relacional
            visitExp(ctx.exp(0))
        }
    }

    // Cuando encuentra una asignación: x = expresion;
    override fun visitAsigna(ctx: PatitoParser.AsignaContext) {
        // Evalúa la expresión del lado derecho y genera sus cuádruplos
        visitExpresion(ctx.expresion())

        // Obtiene el resultado de la expresión de la pila de operandos
        val valor = pilaOperandos.pop()
        // Descarta el tipo asociado ya que no se usa en la asignación
        pilaTipos.pop()
        // Obtiene el nombre de la variable destino
        val nombreVar = ctx.ID().text

        // Genera el cuádruplo de asignación: nombreVar = valor
        cuadruplos.agregar(Cuadruplo("=", valor, "_", nombreVar))
    }

    // Cuando encuentra un escribe(...)
    override fun visitImprime(ctx: PatitoParser.ImprimeContext) {
        var lista = ctx.listaImprime()
        while (lista != null) {
            if (lista.LETRERO() != null) {
                cuadruplos.agregar(Cuadruplo("PRINT", lista.LETRERO().text, "_", "_"))
            } else if (lista.expresion() != null) {
                visitExpresion(lista.expresion())
                val valor = pilaOperandos.pop()
                pilaTipos.pop()
                cuadruplos.agregar(Cuadruplo("PRINT", valor, "_", "_"))
            }
            lista = lista.listaImprime()
        }
    }

    // funcion auxiliar para saltos
    /*  listo para siguiente etapa (saltos condicionales y ciclos)
    private fun rellenarSalto(pos: Int) {
        val c = cuadruplos.obtener(pos)
        // Modifica el cuadruplo en la posición dada para actualizar el resultado con la posición actual de los cuádruplos (usado para backpatching en condicionales y ciclos)
        cuadruplos.modificar(pos, c.copy(resultado = cuadruplos.siguiente().toString()))
    }
    */

    // Genera un cuádruplo con los dos operandos y el operador del tope de las pilas
    private fun generarCuadruplo() {
        // Sacar operando derecho e izquierdo con sus tipos
        val der = pilaOperandos.pop()
        val tipoDer = pilaTipos.pop()
        val izq = pilaOperandos.pop()
        val tipoIzq = pilaTipos.pop()

        // Sacar el operador a aplicar
        val op = pilaOperadores.pop()

        // Consultar el cubo semántico para obtener el tipo resultado de la operación
        val tipoRes = SemanticCube.obtenerTipo(tipoIzq, op, tipoDer)

        // Generar una variable temporal para almacenar el resultado
        val temp = nuevoTemp()

        // Emitir el cuádruplo y empujar el temporal con su tipo a las pilas
        cuadruplos.agregar(Cuadruplo(op, izq, der, temp))
        pilaOperandos.push(temp)
        pilaTipos.push(tipoRes)

        //ejemplo: si tenemos 3 + 4, se genera el cuádruplo (+, 3, 4, t1) y se empuja t1 con tipo ENTERO a las pilas para usarlo en operaciones posteriores
    }

}