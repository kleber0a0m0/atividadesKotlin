/*
Escreva um programa que crie um array de 10 números inteiros aleatórios e
imprima o maior número do array.
 */

fun main() {
    val array = IntArray(10) { (1..100).random() }
    var maior = array[0]

    for (i in 1 until array.size) {
        if (array[i] > maior) {
            maior = array[i]
        }
    }

    println("Maior número do array: $maior")
}
