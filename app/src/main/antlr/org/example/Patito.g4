grammar Patito;

@header {
package org.example;
}

// ── Regla principal ──────────────────────────────────────────
programa
    : PROGRAMA ID PUNTO_COMA vars funcs INICIO cuerpo FIN
    ;

// ── Variables ────────────────────────────────────────────────
vars
    : VARS listaVars
    |
    ;

listaVars
    : listaIds DOS_PUNTOS tipo PUNTO_COMA listaVars
    | listaIds DOS_PUNTOS tipo PUNTO_COMA
    ;

listaIds
    : ID COMA listaIds
    | ID
    ;

tipo
    : ENTERO
    | FLOTANTE
    ;

// ── Funciones ────────────────────────────────────────────────
funcs
    : func funcs
    |
    ;

func
    : ID DOS_PUNTOS NULA ID vars PAREN_IZQ tipo PAREN_DER LLAVE_IZQ cuerpo LLAVE_DER
    | ID DOS_PUNTOS NULA ID vars PAREN_IZQ PAREN_DER LLAVE_IZQ cuerpo LLAVE_DER
    ;

// ── Cuerpo ───────────────────────────────────────────────────
cuerpo
    : estatuto cuerpo
    |
    ;

estatuto
    : asigna
    | condicion
    | ciclo
    | imprime
    | llamada
    ;

// ── Estatutos ────────────────────────────────────────────────
asigna
    : ID ASIGNA expresion PUNTO_COMA
    ;

condicion
    : SI PAREN_IZQ expresion PAREN_DER CORCHETE_IZQ cuerpo CORCHETE_DER SINO CORCHETE_IZQ cuerpo CORCHETE_DER
    | SI PAREN_IZQ expresion PAREN_DER CORCHETE_IZQ cuerpo CORCHETE_DER
    ;

ciclo
    : MIENTRAS PAREN_IZQ expresion PAREN_DER HAZ CORCHETE_IZQ cuerpo CORCHETE_DER
    ;

imprime
    : ESCRIBE PAREN_IZQ listaImprime PAREN_DER PUNTO_COMA
    ;

listaImprime
    : expresion COMA listaImprime
    | expresion
    | LETRERO COMA listaImprime
    | LETRERO
    ;

llamada
    : ID PAREN_IZQ listaArgs PAREN_DER PUNTO_COMA
    | ID PAREN_IZQ PAREN_DER PUNTO_COMA
    ;

listaArgs
    : expresion COMA listaArgs
    | expresion
    ;

// ── Expresiones ──────────────────────────────────────────────
expresion
    : exp opRel exp
    | exp
    ;

opRel
    : MENOR
    | MAYOR
    | DIFERENTE
    | IGUAL
    ;

exp
    : exp SUMA termino
    | exp RESTA termino
    | termino
    ;

termino
    : termino MULT factor
    | termino DIV factor
    | factor
    ;

factor
    : PAREN_IZQ expresion PAREN_DER
    | SUMA cte
    | RESTA cte
    | cte
    | ID
    ;

cte
    : CTE_ENT
    | CTE_FLOT
    ;

// ── Tokens ───────────────────────────────────────────────────
PROGRAMA  : 'programa' ;
INICIO    : 'inicio' ;
FIN       : 'fin' ;
VARS      : 'vars' ;
ENTERO    : 'entero' ;
FLOTANTE  : 'flotante' ;
SI        : 'si' ;
SINO      : 'sino' ;
MIENTRAS  : 'mientras' ;
HAZ       : 'haz' ;
ESCRIBE   : 'escribe' ;
NULA      : 'nula' ;

IGUAL     : '==' ;
DIFERENTE : '!=' ;
ASIGNA    : '=' ;
SUMA      : '+' ;
RESTA     : '-' ;
MULT      : '*' ;
DIV       : '/' ;
MENOR     : '<' ;
MAYOR     : '>' ;

PUNTO_COMA    : ';' ;
COMA          : ',' ;
DOS_PUNTOS    : ':' ;
PAREN_IZQ     : '(' ;
PAREN_DER     : ')' ;
LLAVE_IZQ     : '{' ;
LLAVE_DER     : '}' ;
CORCHETE_IZQ  : '[' ;
CORCHETE_DER  : ']' ;

CTE_FLOT  : [0-9]+ '.' [0-9]+ ;
CTE_ENT   : [0-9]+ ;
LETRERO   : '"' ~["]* '"' ;
ID        : [a-zA-Z][a-zA-Z0-9_]* ;

WS        : [ \t\r\n]+ -> skip ;