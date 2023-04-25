/*
Como remover o último elemento de uma lista em Kotlin?
 */

fun main() {
    val listaNumeros = mutableListOf(1, 2, 3, 4, 5)
    println(listaNumeros)
    listaNumeros.removeAt(listaNumeros.size - 1)
    listaNumeros.removeAt(listaNumeros.size - 1)
    println(listaNumeros)
}
