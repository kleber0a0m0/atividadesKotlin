/*
Crie uma função que receba um array de números inteiros e um número inteiro n
como argumentos e retorne uma nova lista contendo apenas os elementos do array
que estão nas posições múltiplas de n.
 */

fun filtraPosicoesMultiplos(array: Array<Int>, n: Int): List<Int> {
    val filtrados = mutableListOf<Int>()
    for (i in array.indices) {
        if (i % n == 0) {
            filtrados.add(array[i])
        }
    }
    return filtrados
}



fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val filtrados = filtraPosicoesMultiplos(array, 3)
    println(filtrados)
}