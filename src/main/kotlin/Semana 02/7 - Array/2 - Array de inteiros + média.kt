/*
Escreva um programa que crie um array de 10 números inteiros digitados pelo
usuário e imprima a média dos números do array.
 */

fun main() {
    val array = IntArray(10)
    var soma = 0

    for (i in array.indices) {
        print("Digite o ${i+1}º número: ")
        array[i] = readLine()!!.toInt()
        soma += array[i]
    }

    val media = soma.toDouble() / array.size
    println("Média dos números do array: $media")
}
