/*
Crie uma função que receba um array de números inteiros como argumento e
retorne o maior valor presente no array.
 */

fun maiorValor(array: IntArray): Int {
    var maior = array[0]
    for (num in array) {
        if (num > maior) {
            maior = num
        }
    }
    return maior
}

fun main() {
    val array = intArrayOf(5,66,7,8,9);
    println(maiorValor(array));
}
