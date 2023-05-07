/*
2 - Como posso usar uma função de ordem superior para aplicar uma operação a cada
elemento de uma lista em Kotlin?
 */

fun main() {
    val myList = listOf(1, 2, 3, 4, 5)
    myList.forEach { println(it * 2) }
}
