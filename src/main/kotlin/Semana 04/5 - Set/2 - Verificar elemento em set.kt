/*
 Como verificar se um determinado elemento existe em um Set em Kotlin?
 */

fun main() {
    val numeros = setOf(1, 2, 3, 4, 5)
    val temTres = numeros.contains(3)
    println("Tem 3? "+temTres);
}
