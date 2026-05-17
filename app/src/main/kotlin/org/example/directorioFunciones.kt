package org.example

data class VariableInfo(
    val nombre: String,
    val tipo: Tipo
)

data class FunctionInfo(
    val nombre: String,
    val tipoRetorno: Tipo,
    val tablaVariables: MutableMap<String, VariableInfo> = mutableMapOf()
)

class DirectorioFunciones {

    private val funciones: MutableMap<String, FunctionInfo> = mutableMapOf()

    // Agregar una función al directorio
    fun agregarFuncion(nombre: String, tipoRetorno: Tipo): Boolean {
        if (funciones.containsKey(nombre)) {
            println("[ERROR] Función '$nombre' ya fue declarada")
            return false
        }
        funciones[nombre] = FunctionInfo(nombre, tipoRetorno)
        return true
    }

    // Agregar una variable a una función específica
    fun agregarVariable(nombreFuncion: String, nombreVar: String, tipo: Tipo): Boolean {
        val funcion = funciones[nombreFuncion]
        if (funcion == null) {
            println("[ERROR] Función '$nombreFuncion' no existe")
            return false
        }
        if (funcion.tablaVariables.containsKey(nombreVar)) {
            println("[ERROR] Variable '$nombreVar' ya fue declarada en '$nombreFuncion'")
            return false
        }
        funcion.tablaVariables[nombreVar] = VariableInfo(nombreVar, tipo)
        return true
    }

    // Buscar una variable en una función
    fun buscarVariable(nombreFuncion: String, nombreVar: String): VariableInfo? {
        val funcion = funciones[nombreFuncion]
        if (funcion == null) {
            return null
        }
        return funcion.tablaVariables[nombreVar]
    }

    // Verificar si una función existe
    fun existeFuncion(nombre: String): Boolean {
        return funciones.containsKey(nombre)
    }

    // Imprimir el directorio completo
    fun imprimir() {
        println("\n=== DIRECTORIO DE FUNCIONES ===")
        for ((_, funcion) in funciones) {
            println("Función: ${funcion.nombre} | Retorno: ${funcion.tipoRetorno}")
            println("  Variables:")
            if (funcion.tablaVariables.isEmpty()) {
                println("    (ninguna)")
            } else {
                for ((_, variable) in funcion.tablaVariables) {
                    println("    ${variable.nombre} : ${variable.tipo}")
                }
            }
        }
        println("================================\n")
    }
}