// Estructuras de datos para el compilador fila y pilas
package org.example

// Estructura para los cuadruplos
data class Cuadruplo(
    val operador: String,
    val operandoIzq: String,
    val operandoDer: String,
    val resultado: String
)

// Pila para los operandos (variables, constantes, temporales)
class PilaOperandos {
    private val pila = ArrayDeque<String>()
    // Agrega un operando al tope de la pila
    fun push(operando: String) {
        pila.addLast(operando)
    }
    // Saca y devuelve el operando del tope
    // Si la pila está vacía, lanza un error
    fun pop(): String {
        val operando = pila.removeLastOrNull()
        if (operando == null) {
            error("PilaOperandos vacía")
        }
        return operando
    }
    // Devuelve true si la pila no tiene elementos
    fun isEmpty(): Boolean {
        return pila.isEmpty()
    }
}

// Pila para los tipos de datos (ENTERO, FLOTANTE, etc)
class PilaTipos {
    private val pila = ArrayDeque<Tipo>()
    // Agrega un tipo al tope de la pila
    fun push(tipo: Tipo) {
        pila.addLast(tipo)
    }
    // Saca y devuelve el tipo del tope
    // Si la pila está vacía, lanza un error
    fun pop(): Tipo {
        val tipo = pila.removeLastOrNull()
        if (tipo == null) {
            error("PilaTipos vacía")
        }
        return tipo
    }
    // Devuelve true si la pila no tiene elementos
    fun isEmpty(): Boolean {
        return pila.isEmpty()
    }
}

// Pila para los operadores (+, -, *, /, <, >, ==, !=)
class PilaOperadores {
    private val pila = ArrayDeque<String>()
    // Agrega un operador al tope de la pila
    fun push(op: String) {
        pila.addLast(op)
    }
    // Saca y devuelve el operador del tope
    // Si la pila está vacía, lanza un error
    fun pop(): String {
        val op = pila.removeLastOrNull()
        if (op == null) {
            error("PilaOperadores vacía")
        }
        return op
    }
    // Devuelve el operador del tope sin sacarlo
    // Devuelve null si la pila está vacía
    fun peek(): String? {
        return pila.lastOrNull()
    }
    // Devuelve true si la pila no tiene elementos
    fun isEmpty(): Boolean {
        return pila.isEmpty()
    }
}

// Lista de cuádruplos generados durante la compilación
class ListaCuadruplos {
    private val lista = mutableListOf<Cuadruplo>()
    // Agrega un cuádruplo al final de la lista
    // Devuelve su posición para poder rellenarlo después si es un salto
    fun agregar(c: Cuadruplo): Int {
        lista.add(c)
        return lista.size - 1
    }
    // Reemplaza un cuádruplo en una posición específica
    // Se usa para rellenar saltos pendientes (GOTOF, GOTO)
    fun modificar(pos: Int, c: Cuadruplo) {
        lista[pos] = c
    }
    // Devuelve la posición del próximo cuádruplo que se va a generar
    fun siguiente(): Int {
        return lista.size
    }
    // Devuelve el cuádruplo en una posición sin sacarlo
    fun obtener(pos: Int): Cuadruplo {
        return lista[pos]
    }
    // Imprime todos los cuádruplos numerados
    fun imprimir() {
        println("\n=== CUÁDRUPLOS ===")
        for (i in lista.indices) {
            val c = lista[i]
            println("$i: (${c.operador}, ${c.operandoIzq}, ${c.operandoDer}, ${c.resultado})")
        }
    }
}