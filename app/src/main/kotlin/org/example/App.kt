package org.example

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.*

fun probar(nombre: String, codigo: String, esperaValido: Boolean) {
    val input  = CharStreams.fromString(codigo)
    val lexer  = PatitoLexer(input)
    val tokens = CommonTokenStream(lexer)
    val parser = PatitoParser(tokens)

    parser.removeErrorListeners()
    lexer.removeErrorListeners()

    var errores = 0
    val errorListener = object : BaseErrorListener() {
        override fun syntaxError(
            recognizer: Recognizer<*, *>?, // quien detecta el error (lexer o parser)
            offendingSymbol: Any?, // el token que causó el error
            line: Int, // número de línea donde ocurrió el error
            charPositionInLine: Int, // posición del error en la línea
            msg: String?, // mensaje de error generado por ANTLR4
            e: RecognitionException? // excepción que se lanzó (puede ser null)
        ) {
            errores++ 
            println("  [ERROR] línea $line:$charPositionInLine — $msg")
        }
    }

    parser.addErrorListener(errorListener)
    lexer.addErrorListener(errorListener)
    parser.programa()

    val valido = errores == 0
    val resultado = if (valido == esperaValido) "PASS" else "FAIL"
    println("$resultado — $nombre")
    
}
fun analizarSemantica(nombre: String, codigo: String) {
    println("\n$nombre")
    println("─".repeat(40))

    val input  = CharStreams.fromString(codigo)
    val lexer  = PatitoLexer(input)
    val tokens = CommonTokenStream(lexer)
    val parser = PatitoParser(tokens)

    parser.removeErrorListeners()
    lexer.removeErrorListeners()

    val tree = parser.programa()
    val analizador = AnalizadorSemantico()
    analizador.visit(tree)
    analizador.directorio.imprimir()
}
fun generarCuadruplos(nombre: String, codigo: String) {
    println("\n$nombre")
    println("─".repeat(40))

    val input  = CharStreams.fromString(codigo) //secuencia de caracteres que el lexer de ANTLR puede leer uno a uno para generar tokens.
    val lexer  = PatitoLexer(input) 
    val tokens = CommonTokenStream(lexer)
    val parser = PatitoParser(tokens)

    //quita los listeners de errores por defecto de ANTLR4 
    parser.removeErrorListeners() 
    lexer.removeErrorListeners()

    val tree       = parser.programa() //inicia el análisis sintáctico a partir del nodo raíz "programa" de la gramática, y construye el árbol de análisis sintáctico (parse tree)
    val analizador = AnalizadorSemantico() // Crea el analizador y recorre el árbol. utiliza las funciones de AnalizadorSemantico()
    analizador.visit(tree)
    analizador.cuadruplos.imprimir()
}

fun main() {
    println("=== TEST CASES PATITO ===\n")

    // TC-01 Programa mínimo
    // Abre  y cierra un programa sin variables ni instrucciones.     
    probar("TC-01 Programa mínimo", """
        programa minimo;
        inicio
        fin
    """.trimIndent(), true)

    // TC-02 Una variable
    // Declara una variable entera sin usarla.
    probar("TC-02 Una variable", """
        programa unaVar;
        vars
            x : entero;
        inicio
        fin
    """.trimIndent(), true)

    // TC-03 Una asignación
    // Declara una variable entera y le asigna un valor.
    probar("TC-03 Una asignación", """
        programa asignacion;
        vars
            x : entero;
        inicio
            x = 5;
        fin
    """.trimIndent(), true)

    // TC-04 Escribe un texto
    // Usa la función escribe para mostrar un mensaje en pantalla.
    probar("TC-04 Escribe un texto", """
        programa hola;
        inicio
            escribe("Hola mundo");
        fin
    """.trimIndent(), true)

    // TC-05 Suma simple
    // Declara tres variables enteras y calcula la suma de las dos primeras.
    probar("TC-05 Suma simple", """
        programa suma;
        vars
            x, y, z : entero;
        inicio
            x = 3;
            y = 4;
            z = x + y;
        fin
    """.trimIndent(), true)

    // TC-06 Si simple
    // Declara una variable entera y usa un condicional para mostrar un mensaje.
    probar("TC-06 Si simple", """
        programa condicion;
        vars
            x : entero;
        inicio
            x = 10;
            si (x > 5) [
                escribe("es mayor");
            ]
        fin
    """.trimIndent(), true)

    // TC-07 Si-sino
    // Declara una variable entera y usa un condicional con else para mostrar un mensaje.
    probar("TC-07 Si-sino", """
        programa siSino;
        vars
            x : entero;
        inicio
            x = 3;
            si (x > 5) [
                escribe("mayor");
            ] sino [
                escribe("menor");
            ]
        fin
    """.trimIndent(), true)

    // TC-08 Ciclo mientras
    // Declara una variable entera y usa un ciclo mientras para mostrar sus valores.
    probar("TC-08 Ciclo mientras", """
        programa contador;
        vars
            i : entero;
        inicio
            i = 1;
            mientras (i < 6) haz [
                escribe(i);
                i = i + 1;
            ]
        fin
    """.trimIndent(), true)


    // TC-09 Falta punto y coma
    // Declara una variable entera y le asigna un valor sin el punto y coma al final.
    probar("TC-09 Falta punto y coma", """
        programa error1;
        vars
            x : entero;
        inicio
            x = 5 // Falta punto y coma aquí
        fin
    """.trimIndent(), false)

    // TC-10 Falta corchete de cierre
    // Declara una variable entera y usa un condicional sin cerrar el bloque con el corchete.   
    probar("TC-10 Falta corchete de cierre", """
        programa error2;
        vars
            x : entero;
        inicio
            si (x > 5) [
                escribe("hola");
                // Falta corchete de cierre aquí
        fin
    """.trimIndent(), false)

    // TC-11 Palabra reservada como nombre
    // Intenta usar una palabra reservada (inicio) como nombre de programa.
    probar("TC-11 Palabra reservada como nombre", """
        programa inicio; // No se puede usar "inicio" como nombre de programa
        inicio
        fin
    """.trimIndent(), false)

    // TC-12 Falta inicio
    // Declara un programa con variables pero sin la sección de inicio.
    probar("TC-12 Falta inicio", """
        programa error4; // Falta la sección de inicio
            x = 5;
        fin
    """.trimIndent(), false)

    // TC-13 Operador inválido
    // Intenta usar un operador no definido (%) en una expresión.   
    probar("TC-13 Operador inválido", """
        programa error5;
        vars
            x : entero;
        inicio
            x = 5 % 2; // El operador % no está definido en el lenguaje
        fin
    """.trimIndent(), false)

    // ── Pruebas semánticas ──────────────────────────────────────

    analizarSemantica("Semántica TC-01 — Programa simple", """
        programa miProg;
        vars
            x, y : entero; 
            pi   : flotante; 
        inicio
            x = 5; // Asignación de un valor entero a x
        fin
    """.trimIndent()) 

    analizarSemantica("Semántica TC-02 — Variable doblemente declarada", """
        programa error;
        vars
            x : entero;
            x : flotante;
        inicio
        fin
    """.trimIndent())

    generarCuadruplos("CQ-01 Suma simple", """
        programa suma;
        vars
            x, y, z : entero;
        inicio
            x = 3;
            y = 4;
            z = x + y;
        fin
    """.trimIndent())
    
    generarCuadruplos("CQ-02 Multiplicación y suma mixta", """
        programa prueba;
        vars
            a, b : entero;
            resultado : flotante;
        inicio
            a = 10;
            b = 3;
            resultado = a * b + 2.5;
            escribe("El resultado es: ", resultado);
        fin
    """.trimIndent())

    generarCuadruplos("CQ-03 Expresión relacional", """
        programa comparacion;
        vars
            x, y : entero;
        inicio
            x = 5;
            y = 10;
            escribe(x < y);
        fin
    """.trimIndent())

    generarCuadruplos("CQ-04 Expresión con paréntesis", """
        programa parens;
        vars
            a, b, c : entero;
            resultado : entero;
        inicio
            a = 2;
            b = 3;
            c = 4;
            resultado = a + (b * c);
            escribe("El resultado es: ", resultado);
        fin
    """.trimIndent())

        
/* 
    generarCuadruplos("CQ-02 Si-sino", """
        programa siSino;
        vars
            x : entero;
        inicio
            x = 3;
            si (x > 5) [
                escribe("mayor");
            ] sino [
                escribe("menor");
            ]
        fin
    """.trimIndent())

    generarCuadruplos("CQ-03 Ciclo mientras", """
        programa contador;
        vars
            i : entero;
        inicio
            i = 1;
            mientras (i < 4) haz [
                escribe(i);
                i = i + 1;
            ]
        fin
    """.trimIndent())
    */
}