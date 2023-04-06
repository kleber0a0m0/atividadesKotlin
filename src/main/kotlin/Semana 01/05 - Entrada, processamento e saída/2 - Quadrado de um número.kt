/*
Faça um programa que calcule o quadrado de um número informado pelo usuário.
 */

fun main() {
    println("Digite um número:")
    val numero = readLine()?.toDouble() ?: 0.0
    val quadrado = numero * numero
    println("O quadrado do número $numero é $quadrado")
}
