# Análisis Léxico y Análisis Sintáctico

Dada la gramática de Decaf escrita en antlr, ejecutar los siguientes comandos para compilar la gramática:
```
  antlr4 Decaf.g4
  javac Decaf*.java
```

## Análisis Léxico
Se escribió un programa para obtener los tokens de la gramática y mostrarlos.

Compilar el programa Lexer:
```
  javac Lexer.java
```

Luego, para cada programa escrito en el lenguaje Decaf, ejecutar lo siguiente:
```
  java Lexer .\Programs\gcd.decaf
```
<p align="center">
  <img src="https://github.com/javiercarpio57/Analisis-Lexico-Sintactico/blob/main/Images/gcd_lexer.JPG">
</p>

```
  java Lexer .\Programs\suma.decaf
```
<p align="center">
  <img src="https://github.com/javiercarpio57/Analisis-Lexico-Sintactico/blob/main/Images/suma_lexer.JPG">
</p>

## Análisis Sintáctico

Después, para visualizar el árbol sintáctico de cada programa, ejecutar:
```
  grun Decaf program -gui .\Programs\GCD.decaf
```
<p align="center">
  <img src="https://github.com/javiercarpio57/Analisis-Lexico-Sintactico/blob/main/Images/gcd_parse_tree.svg">
</p>

```
  grun Decaf program -gui .\Programs\suma.decaf
```
<p align="center">
  <img src="https://github.com/javiercarpio57/Analisis-Lexico-Sintactico/blob/main/Images/suma_parse_tree.svg">
</p>

## Errores léxicos y sintácticos

Si eliminamos algún ';', '{', '}' del programa, se identificarán errores léxicos y sintácticos dentro del programa.
<p align="center">
  <img src="https://github.com/javiercarpio57/Analisis-Lexico-Sintactico/blob/main/Images/programa_error.JPG">
</p><p align="center">
  <img src="https://github.com/javiercarpio57/Analisis-Lexico-Sintactico/blob/main/Images/error.JPG">
</p>
