/*
Faça um programa que receba um número de 1 a 7 e exiba o dia da semana correspondente usando when.
 */

fun main() {
    println("Digite um número de 1 a 7:")
    val dia = readLine()?.toInt()

    when (dia) {
        1 -> println("Domingo")
        2 -> println("Segunda-feira")
        3 -> println("Terça-feira")
        4 -> println("Quarta-feira")
        5 -> println("Quinta-feira")
        6 -> println("Sexta-feira")
        7 -> println("Sábado")
        else -> println("Número inválido!")
    }
}
