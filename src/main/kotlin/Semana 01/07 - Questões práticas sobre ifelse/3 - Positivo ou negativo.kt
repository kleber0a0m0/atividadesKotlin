/*
Faça um programa que receba um número inteiro e verifique se ele é positivo, negativo ou zero usando if/else.
 */

fun main() {
    print("Digite um número inteiro: ")
    val numero = readLine()!!.toInt()

    if (numero > 0) {
        println("$numero é positivo")
    } else if (numero < 0) {
        println("$numero é negativo")
    } else {
        println("O número é zero")
    }
}
