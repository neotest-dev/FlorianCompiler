package parser;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
%column
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

// Ignorar espacios y tabulaciones
<YYINITIAL> {
    [ \t\r]+  { /* Ignorar espacios y tabulaciones */ }
}


/* Salto de linea */
("\n") { 
    yyline++;
    yycolumn = 0; // Reiniciar columnas al iniciar una nueva línea
}


/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Tipos de datos */
( byte | char | long | float | double | String | int ) {return new Symbol(sym.T_dato, yychar, yyline, yytext());}

// Palabras clave
"package" { return new java_cup.runtime.Symbol(sym.Paquete, yytext()); }
"public" { return new java_cup.runtime.Symbol(sym.Publico, yytext()); }
"class" { return new java_cup.runtime.Symbol(sym.Clase, yytext()); }
"static" { return new java_cup.runtime.Symbol(sym.Static, yytext()); }
"void" { return new java_cup.runtime.Symbol(sym.Void, yytext()); }
"args" { return new java_cup.runtime.Symbol(sym.Args, yytext()); }
"System" { return new java_cup.runtime.Symbol(sym.SYSTEM, yytext()); }
"out" { return new java_cup.runtime.Symbol(sym.Out, yytext()); }
"println" { return new java_cup.runtime.Symbol(sym.Imprimir, yytext()); }
"main" { return new java_cup.runtime.Symbol(sym.Main, yytext()); }
"if" { return new java_cup.runtime.Symbol(sym.If, yytext()); }
"else" { return new java_cup.runtime.Symbol(sym.Else, yytext()); }
"do" { return new java_cup.runtime.Symbol(sym.Do, yytext()); }
"while" { return new java_cup.runtime.Symbol(sym.While, yytext()); }
"for" { return new java_cup.runtime.Symbol(sym.For, yytext()); }

// Operadores
"=" { return new java_cup.runtime.Symbol(sym.Igual, yytext()); }
"+" { return new java_cup.runtime.Symbol(sym.Suma, yytext()); }
"-" { return new java_cup.runtime.Symbol(sym.Resta, yytext()); }
"*" { return new java_cup.runtime.Symbol(sym.Multiplicacion, yytext()); }
"/" { return new java_cup.runtime.Symbol(sym.Division, yytext()); }

// Operadores lógicos
"&&" { return new java_cup.runtime.Symbol(sym.Op_logico, yytext()); }
"||" { return new java_cup.runtime.Symbol(sym.Op_logico, yytext()); }
"!" { return new java_cup.runtime.Symbol(sym.Op_logico, yytext()); }

// Operadores relacionales
">" { return new java_cup.runtime.Symbol(sym.Op_relacional, yytext()); }
"<" { return new java_cup.runtime.Symbol(sym.Op_relacional, yytext()); }
"==" { return new java_cup.runtime.Symbol(sym.Op_relacional, yytext()); }
"!=" { return new java_cup.runtime.Symbol(sym.Op_relacional, yytext()); }
">=" { return new java_cup.runtime.Symbol(sym.Op_relacional, yytext()); }
"<=" { return new java_cup.runtime.Symbol(sym.Op_relacional, yytext()); }

// Operadores de asignación
"+=" { return new java_cup.runtime.Symbol(sym.Op_atribucion, yytext()); }
"-=" { return new java_cup.runtime.Symbol(sym.Op_atribucion, yytext()); }
"*=" { return new java_cup.runtime.Symbol(sym.Op_atribucion, yytext()); }
"/=" { return new java_cup.runtime.Symbol(sym.Op_atribucion, yytext()); }
"=" { return new java_cup.runtime.Symbol(sym.Op_atribucion, yytext()); }

// Operadores de incremento y decremento
"++" { return new java_cup.runtime.Symbol(sym.Op_incremento, yytext()); }
"--" { return new java_cup.runtime.Symbol(sym.Op_incremento, yytext()); }

// Operadores booleanos
"true" { return new java_cup.runtime.Symbol(sym.Op_booleano, yytext()); }
"false" { return new java_cup.runtime.Symbol(sym.Op_booleano, yytext()); }

// Paréntesis
"(" { return new java_cup.runtime.Symbol(sym.Parentesis_a, yytext()); }
")" { return new java_cup.runtime.Symbol(sym.Parentesis_c, yytext()); }

// Llaves
"{" { return new java_cup.runtime.Symbol(sym.Llave_a, yytext()); }
"}" { return new java_cup.runtime.Symbol(sym.Llave_c, yytext()); }

// Corchetes
"[" { return new java_cup.runtime.Symbol(sym.Corchete_a, yytext()); }
"]" { return new java_cup.runtime.Symbol(sym.Corchete_c, yytext()); }

// Dos puntos
":" { return new java_cup.runtime.Symbol(sym.P_dos, yytext()); }

// Punto y coma
";" { return new java_cup.runtime.Symbol(sym.P_coma, yytext()); }

// Signo de punto
"." { return new java_cup.runtime.Symbol(sym.Signo_punto, yytext()); }

// Identificadores (nombre de variables o funciones)
{L}({L}|{D})* { return new java_cup.runtime.Symbol(sym.Identificador, yytext()); }

// Números (enteros)
{D} { return new java_cup.runtime.Symbol(sym.Numero, yytext()); }

// Error léxico
. { 
    System.err.println("Error léxico en línea " + (yyline + 1) + 
                        ", columna " + (yycolumn + 1) + 
                        ": " + yytext());
    return symbol(sym.ERROR, yytext()); 
}

