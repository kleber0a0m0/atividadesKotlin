/*
Crie uma função que receba um número inteiro como argumento e retorne
verdadeiro se o mesmo for par e falso caso contrário.
 */

fun par(num: Int): Boolean {
    return num % 2 == 0
}

fun main() {
    println("Par:"+par(5));
}
