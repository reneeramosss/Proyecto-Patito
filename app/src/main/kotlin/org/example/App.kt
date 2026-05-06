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
            recognizer: Recognizer<*, *>?,
            offendingSymbol: Any?,
            line: Int,
            charPositionInLine: Int,
            msg: String?,
            e: RecognitionException?
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
}