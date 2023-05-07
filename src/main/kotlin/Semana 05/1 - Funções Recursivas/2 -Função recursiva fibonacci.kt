/*
Crie uma função recursiva que calcule o enésimo termo da sequência de Fibonacci.
 */
fun fibonacci(n: Int): Int {
    if (n < 2) return n
    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun main() {
    val n = 5
    for (i in 0 until n) {
        println(fibonacci(i))
    }
}