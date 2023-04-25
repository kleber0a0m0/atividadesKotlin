/*
Crie uma função que receba uma string como argumento e retorne verdadeiro se a
mesma for palíndromo (ou seja, lida da esquerda para direita é igual a lida da direita
para esquerda) e falso caso contrário.
 */

fun palindromo(str: String): Boolean {
    val strInvertida = str.reversed()
    return str == strInvertida
}

fun main() {
    println(palindromo("ANA"));
}
