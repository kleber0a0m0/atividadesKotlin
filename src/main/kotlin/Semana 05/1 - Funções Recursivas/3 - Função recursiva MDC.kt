/*
Crie uma função recursiva que calcule o MDC (Máximo Divisor Comum) entre dois
números inteiros positivos.
 */
fun mdc(a: Int, b: Int): Int {
    return if (b == 0) a else mdc(b, a % b)
}


fun main() {
    val result = mdc(24, 36)
    println(result);
}