/*
Como remover um elemento específico de um Set em Kotlin?
 */

fun main() {
    val numeros = mutableSetOf(1, 2, 3, 4, 5)
    println(numeros);
    numeros.remove(3)
    println(numeros);
}
