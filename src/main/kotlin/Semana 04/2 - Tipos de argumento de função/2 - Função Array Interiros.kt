/*
Crie uma função que receba um array de números inteiros e um número inteiro n
como argumentos e retorne uma nova lista contendo apenas os elementos do array
que são maiores do que n.
 */

fun maioresQueN(numeros: Array<Int>, n: Int): List<Int> {
    val maiores = mutableListOf<Int>()
    for (numero in numeros) {
        if (numero > n) {
            maiores.add(numero)
        }
    }
    return maiores
}

fun main() {
    val numeros = arrayOf(1, 2, 3, 4, 5)
    val n = 3
    val maiores = maioresQueN(numeros, n)
    println(maiores) // irá imprimir [4, 5]


}