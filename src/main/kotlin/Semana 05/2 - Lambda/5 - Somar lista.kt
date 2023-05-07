/*
Como posso usar uma função de ordem superior para somar todos os elementos de
uma lista em Kotlin?
 */

fun main() {
    val lista = listOf(1, 2, 3, 4, 5)
    val soma = lista.reduce { acc, n -> acc + n }
    println(soma)
}
