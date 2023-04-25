/*
Como adicionar um elemento na posição 2 de uma lista já existente em Kotlin?
*/

fun main() {
    val listaNumeros = mutableListOf(1, 2, 3, 4, 5)
    println(listaNumeros)
    listaNumeros.add(2, 42)
    println(listaNumeros)
}
