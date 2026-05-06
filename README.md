# Compilador Patito 🐥

Proyecto de compilador para el lenguaje Patito desarrollado con Kotlin y ANTLR4.

**TC3002B | María Renée Ramos Valdez | A01252966**

## Requisitos
- Kotlin 2.3.21
- Gradle 9.5.0
- Java (OpenJDK 25)

## Cómo ejecutar

1. Entrar a la carpeta del proyecto:
cd patito-compiler

2. Configurar Java:
export JAVA_HOME=/opt/homebrew/opt/openjdk/libexec/openjdk.jdk/Contents/Home

3. Generar el Scanner y Parser:
./gradlew generateGrammarSource

4. Ejecutar los test cases:
./gradlew run

## Resultado esperado
=== TEST CASES PATITO ===
PASS — TC-01 Programa mínimo
PASS — TC-02 Una variable
PASS — TC-03 Una asignación
PASS — TC-04 Escribe un texto
PASS — TC-05 Suma simple
PASS — TC-06 Si simple
PASS — TC-07 Si-sino
PASS — TC-08 Ciclo mientras
PASS — TC-09 Falta punto y coma
PASS — TC-10 Falta corchete de cierre
PASS — TC-11 Palabra reservada como nombre
PASS — TC-12 Falta inicio
PASS — TC-13 Operador inválido