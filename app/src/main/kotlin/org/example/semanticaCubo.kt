package org.example

// Cubo semántico para operaciones entre tipos de datos
enum class Tipo {
    ENTERO,
    FLOTANTE,
    BOOLEANO,
    NULA,
    ERROR
}

object SemanticCube {

    private val cubo = mapOf(
        // ── Suma ──────────────────────────────────────────
        /* 
        Entero + Entero   = Entero
        Entero + Flotante = Flotante
        Flotante + Entero = Flotante
        Flotante + Flotante = Flotante
        */
        Triple(Tipo.ENTERO,   "+", Tipo.ENTERO)   to Tipo.ENTERO,
        Triple(Tipo.ENTERO,   "+", Tipo.FLOTANTE)  to Tipo.FLOTANTE,
        Triple(Tipo.FLOTANTE, "+", Tipo.ENTERO)   to Tipo.FLOTANTE,
        Triple(Tipo.FLOTANTE, "+", Tipo.FLOTANTE)  to Tipo.FLOTANTE,

        // ── Resta ─────────────────────────────────────────
        /* 
        Entero - Entero   = Entero
        Entero - Flotante = Flotante
        Flotante - Entero = Flotante
        Flotante - Flotante = Flotante
        */

        Triple(Tipo.ENTERO,   "-", Tipo.ENTERO)   to Tipo.ENTERO,
        Triple(Tipo.ENTERO,   "-", Tipo.FLOTANTE)  to Tipo.FLOTANTE,
        Triple(Tipo.FLOTANTE, "-", Tipo.ENTERO)   to Tipo.FLOTANTE,
        Triple(Tipo.FLOTANTE, "-", Tipo.FLOTANTE)  to Tipo.FLOTANTE,

        // ── Multiplicación ────────────────────────────────
        /*
        Entero * Entero   = Entero
        Entero * Flotante = Flotante
        Flotante * Entero = Flotante
        Flotante * Flotante = Flotante
        */
        Triple(Tipo.ENTERO,   "*", Tipo.ENTERO)   to Tipo.ENTERO,
        Triple(Tipo.ENTERO,   "*", Tipo.FLOTANTE)  to Tipo.FLOTANTE,
        Triple(Tipo.FLOTANTE, "*", Tipo.ENTERO)   to Tipo.FLOTANTE,
        Triple(Tipo.FLOTANTE, "*", Tipo.FLOTANTE)  to Tipo.FLOTANTE,

        // ── División ──────────────────────────────────────
        /*
        Entero / Entero   = Entero
        Entero / Flotante = Flotante
        Flotante / Entero = Flotante
        Flotante / Flotante = Flotante
        */
        Triple(Tipo.ENTERO,   "/", Tipo.ENTERO)   to Tipo.ENTERO,
        Triple(Tipo.ENTERO,   "/", Tipo.FLOTANTE)  to Tipo.FLOTANTE,
        Triple(Tipo.FLOTANTE, "/", Tipo.ENTERO)   to Tipo.FLOTANTE,
        Triple(Tipo.FLOTANTE, "/", Tipo.FLOTANTE)  to Tipo.FLOTANTE,

        // ── Relacionales ──────────────────────────────────
        /*
        Entero > Entero   = Booleano
        Entero > Flotante = Booleano
        Flotante > Entero = Booleano
        Flotante > Flotante = Booleano
         */
        Triple(Tipo.ENTERO,   ">",  Tipo.ENTERO)   to Tipo.BOOLEANO,
        Triple(Tipo.ENTERO,   ">",  Tipo.FLOTANTE)  to Tipo.BOOLEANO,
        Triple(Tipo.FLOTANTE, ">",  Tipo.ENTERO)   to Tipo.BOOLEANO,
        Triple(Tipo.FLOTANTE, ">",  Tipo.FLOTANTE)  to Tipo.BOOLEANO,

        /*
        Entero < Entero   = Booleano
        Entero < Flotante = Booleano
        Flotante < Entero = Booleano
        Flotante < Flotante = Booleano
         */

        Triple(Tipo.ENTERO,   "<",  Tipo.ENTERO)   to Tipo.BOOLEANO,
        Triple(Tipo.ENTERO,   "<",  Tipo.FLOTANTE)  to Tipo.BOOLEANO,
        Triple(Tipo.FLOTANTE, "<",  Tipo.ENTERO)   to Tipo.BOOLEANO,
        Triple(Tipo.FLOTANTE, "<",  Tipo.FLOTANTE)  to Tipo.BOOLEANO,

        /*
        Entero == Entero   = Booleano
        Entero == Flotante = Booleano
        Flotante == Entero = Booleano           
        Flotante == Flotante = Booleano
         */
        Triple(Tipo.ENTERO,   "==", Tipo.ENTERO)   to Tipo.BOOLEANO,
        Triple(Tipo.ENTERO,   "==", Tipo.FLOTANTE)  to Tipo.BOOLEANO,
        Triple(Tipo.FLOTANTE, "==", Tipo.ENTERO)   to Tipo.BOOLEANO,
        Triple(Tipo.FLOTANTE, "==", Tipo.FLOTANTE)  to Tipo.BOOLEANO,

        /*
        Entero != Entero   = Booleano
        Entero != Flotante = Booleano
        Flotante != Entero = Booleano
        Flotante != Flotante = Booleano
         */
        Triple(Tipo.ENTERO,   "!=", Tipo.ENTERO)   to Tipo.BOOLEANO,
        Triple(Tipo.ENTERO,   "!=", Tipo.FLOTANTE)  to Tipo.BOOLEANO,
        Triple(Tipo.FLOTANTE, "!=", Tipo.ENTERO)   to Tipo.BOOLEANO,
        Triple(Tipo.FLOTANTE, "!=", Tipo.FLOTANTE)  to Tipo.BOOLEANO,
    )

    // Función para obtener el tipo resultante de una operación

    fun obtenerTipo(tipoIzq: Tipo, operador: String, tipoDer: Tipo): Tipo {
    val resultado = cubo[Triple(tipoIzq, operador, tipoDer)]
    if (resultado == null) {
        return Tipo.ERROR
    }
    return resultado
}
}