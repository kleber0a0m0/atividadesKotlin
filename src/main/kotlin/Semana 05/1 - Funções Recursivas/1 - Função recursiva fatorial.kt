/*
Crie uma função recursiva que calcule o enésimo termo da sequência de Fibonacci.
 */
fun fatorial(n: Int): Int {
    if (n < 0) {
        throw IllegalArgumentException("O argumento deve ser um número inteiro não negativo")
    }
    return if (n == 0) {
        1
    } else {
        n * fatorial(n - 1)
    }
}

fun main() {
    val resultado = fatorial(5)
    println(resultado);
}