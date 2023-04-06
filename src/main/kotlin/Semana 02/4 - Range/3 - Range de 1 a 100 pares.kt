/*
Crie um range de números de 1 a 100 e imprima apenas os números pares:
 */

fun main(args: Array<String>) {
    val numeros = 1..100
    for (num in numeros) {
        if (num % 2 == 0) {
            println(num)
        }
    }
}
