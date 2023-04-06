/*
Escreva um programa que imprima todos os números de 0 a 10, exceto o número 5,
usando continue.
 */

fun main(args: Array<String>) {
    for (i in 0..10) {
        if (i == 5) {
            continue
        }
        println(i)
    }
}
