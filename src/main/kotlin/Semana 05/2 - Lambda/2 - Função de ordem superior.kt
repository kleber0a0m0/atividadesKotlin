/*
Como posso usar uma função lambda para filtrar elementos de uma lista em Kotlin?
 */

fun main() {
    val lista = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = lista.filter { it % 2 == 0 }
    println(pares)
}
