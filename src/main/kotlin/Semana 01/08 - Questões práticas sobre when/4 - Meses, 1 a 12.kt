/*
Faça um programa que receba um número de 1 a 12 e exiba o mês correspondente usando when.
 */

fun main() {
    println("Digite um número de 1 a 12:")
    val mes = readLine()?.toInt()

    when (mes) {
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
        else -> println("Número inválido!")
    }
}
