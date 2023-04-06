/*
Faça um programa que verifique se uma pessoa é maior de idade (18 anos ou mais) usando if/else.
 */

fun main() {
    print("Digite a idade da pessoa: ")
    val idade = readLine()!!.toInt()

    if (idade >= 18) {
        println("A pessoa é maior de idade")
    } else {
        println("A pessoa é menor de idade")
    }
}
