/*Faça um programa que receba um número inteiro e verifique se ele é par ou ímpar usando if/else.
 */

fun main() {
    print("Digite um número inteiro: ")
    val numero = readLine()!!.toInt()

    if (numero % 2 == 0) {
        println("$numero é par")
    } else {
        println("$numero é ímpar")
    }
}
