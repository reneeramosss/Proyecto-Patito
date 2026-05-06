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
    probar("TC-01 Programa mínimo", """
        programa minimo;
        inicio
        fin
    """.trimIndent(), true)

    // TC-02 Declaración de variables
    probar("TC-02 Declaración de variables", """
        programa vars;
        vars
            x, y : entero;
            pi   : flotante;
        inicio
        fin
    """.trimIndent(), true)

    // TC-03 Condicional si sin sino
    probar("TC-03 Condicional si", """
        programa cond1;
        vars n : entero;
        inicio
            n = 10;
            si (n > 5) [
                escribe("mayor");
            ]
        fin
    """.trimIndent(), true)

    // TC-04 Condicional si-sino
    probar("TC-04 Condicional si-sino", """
        programa cond2;
        vars n : entero;
        inicio
            n = 3;
            si (n > 5) [
                escribe("mayor");
            ] sino [
                escribe("menor");
            ]
        fin
    """.trimIndent(), true)

    // TC-05 Ciclo mientras
    probar("TC-05 Ciclo mientras", """
        programa ciclo;
        vars i : entero;
        inicio
            i = 0;
            mientras (i < 5) haz [
                i = i + 1;
            ]
        fin
    """.trimIndent(), true)

    // TC-06 Escribe múltiples argumentos
    probar("TC-06 Escribe múltiples args", """
        programa imprime;
        vars x : entero;
        inicio
            x = 42;
            escribe("valor:", x);
        fin
    """.trimIndent(), true)

    // TC-07 Aritmética compleja
    probar("TC-07 Aritmética compleja", """
        programa arit;
        vars a, b, c : entero;
        inicio
            a = 2;
            b = 3;
            c = (a + b) * 4 - 1;
        fin
    """.trimIndent(), true)

    // TC-08 Programa completo integración
    probar("TC-08 Programa completo", """
        programa completo;
        vars
            i, suma : entero;
            prom    : flotante;
        inicio
            i    = 1;
            suma = 0;
            mientras (i < 11) haz [
                suma = suma + i;
                i = i + 1;
            ]
            prom = suma / 10;
            escribe("Suma:", suma, "Promedio:", prom);
        fin
    """.trimIndent(), true)
}