/*
Escreva um programa que leia números do usuário e pare quando o número
digitado for negativo usando break.
 */

fun main(args: Array<String>) {
    var num: Int
    while (true) {
        print("Digite um número: ")
        num = readLine()!!.toInt()
        if (num < 0) {
            break
        }
    }
    println("Você digitou um número negativo, o programa foi encerrado.")
}
