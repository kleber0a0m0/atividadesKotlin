/*
Faça um programa que peça ao usuário para informar seu nome e sua idade, e que exiba uma mensagem de boas-vindas com o nome e a idade informados.
 */

fun main() {
    println("Qual é o seu nome?")
    val nome = readLine() ?: ""
    println("Qual é a sua idade?")
    val idade = readLine()?.toInt() ?: 0
    println("Olá, $nome! Você tem $idade anos.")
}
