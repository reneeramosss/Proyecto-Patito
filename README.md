# Compilador Patito 🐥

Proyecto de compilador para el lenguaje Patito desarrollado con Kotlin y ANTLR4.

**TC3002B | María Renée Ramos Valdez | A01252966**

## Requisitos

- Kotlin 2.3.21
- Gradle 9.5.0
- Java (OpenJDK 25)

## Cómo ejecutar

1. Entrar a la carpeta del proyecto:
   ```bash
   cd patito-compiler
   ```

2. Configurar Java:
   ```bash
   export JAVA_HOME=/opt/homebrew/opt/openjdk/libexec/openjdk.jdk/Contents/Home
   ```

3. Generar el Scanner y Parser:
   ```bash
   ./gradlew generateGrammarSource
   ```

4. Ejecutar los test cases:
   ```bash
   ./gradlew run
   ```

## Resultado esperado

```
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
```

## Etapa 2: Análisis Semántico

Archivos nuevos:
- `semanticaCubo.kt` — Cubo semántico con tipos ENTERO, FLOTANTE, BOOLEANO, ERROR
- `directorioFunciones.kt` — Directorio de funciones y tabla de variables
- `analizadorSemantico.kt` — Visitor que recorre el árbol y llena el directorio

### Resultado esperado Etapa 2

```
Semántica TC-01 — Programa simple
────────────────────────────────────────
Programa encontrado: miProg
Variable encontrada: x : ENTERO en miProg
Variable encontrada: y : ENTERO en miProg
Variable encontrada: pi : FLOTANTE en miProg

=== DIRECTORIO DE FUNCIONES ===
Función: miProg | Retorno: NULA
  Variables:
    x : ENTERO
    y : ENTERO
    pi : FLOTANTE
================================

Semántica TC-02 — Variable doblemente declarada
────────────────────────────────────────
[ERROR] Variable 'x' ya fue declarada en 'error'
```

## Etapa 3: Generación de Cuádruplos

Archivos nuevos:
- `Estructuras.kt` — Cuádruplo, PilaOperandos, PilaTipos, PilaOperadores, ListaCuadruplos

Modificado:
- `analizadorSemantico.kt` — Se agregaron visitFactor, visitTermino, visitExp, visitExpresion, visitAsigna, visitImprime, visitCondicion y visitCiclo para generar cuádruplos

### Resultado esperado Etapa 3

```
CQ-01 Suma simple
────────────────────────────────────────
=== CUÁDRUPLOS ===
0: (=, 3, _, x)
1: (=, 4, _, y)
2: (+, x, y, t1)
3: (=, t1, _, z)

CQ-02 Multiplicación y suma mixta
────────────────────────────────────────
=== CUÁDRUPLOS ===
0: (=, 10, _, a)
1: (=, 3, _, b)
2: (*, a, b, t1)
3: (+, t1, 2.5, t2)
4: (=, t2, _, resultado)
5: (PRINT, "El resultado es: ", _, _)
6: (PRINT, resultado, _, _)

CQ-03 Expresión relacional
────────────────────────────────────────
=== CUÁDRUPLOS ===
0: (=, 5, _, x)
1: (=, 10, _, y)
2: (<, x, y, t1)
3: (PRINT, t1, _, _)

CQ-04 Expresión con paréntesis
────────────────────────────────────────
=== CUÁDRUPLOS ===
0: (=, 2, _, a)
1: (=, 3, _, b)
2: (=, 4, _, c)
3: (*, b, c, t1)
4: (+, a, t1, t2)
5: (=, t2, _, resultado)
6: (PRINT, "El resultado es: ", _, _)
7: (PRINT, resultado, _, _)
```
