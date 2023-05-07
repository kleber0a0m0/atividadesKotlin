/*
Como posso usar uma função lambda para encontrar o maior valor em uma lista em
Kotlin?
 */

fun main() {
    val lista = listOf(10, 5, 8, 15, 3)
    val maior = lista.maxBy { it }
    println(maior)
}
