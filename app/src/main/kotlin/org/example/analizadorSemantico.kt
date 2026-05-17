// AnalizadorSemantico.kt
// Este archivo recorre el árbol de parseo generado por ANTLR4 usando el patrón Visitor.
// Por cada regla importante de la gramática (programa, variables, funciones) 
// tiene un método override que se ejecuta automáticamente cuando ANTLR4 llega a ese nodo.
// ctx (context) es el objeto que contiene toda la información que ANTLR4 reconoció en esa regla.
// Llena el DirectorioFunciones con las funciones y variables del programa.

package org.example

class AnalizadorSemantico : PatitoBaseVisitor<Unit>() {

    val directorio = DirectorioFunciones()
    private var funcionActual = "global" // Para saber en qué función estamos al declarar variables

    //Cuando encuentra: programa miProg;
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

    // Cuando encuentra la sección vars — recorre todas las declaraciones
    // ctx.listaVars() devuelve el primer nodo listaVars, y luego se va recorriendo cada listaVars hija hasta que no haya más
    override fun visitVars(ctx: PatitoParser.VarsContext) {
        var listaVars = ctx.listaVars()
        while (listaVars != null) {
            visitListaVars(listaVars)
            listaVars = listaVars.listaVars()
        }
    }

    // Cuando encuentra: x, y : entero;
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

    // Cuando encuentra una función
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
}