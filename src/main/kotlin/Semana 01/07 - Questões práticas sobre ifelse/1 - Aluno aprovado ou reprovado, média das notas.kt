/*
Faça um programa que receba duas notas de um aluno e calcule a média. Se a média for
maior ou igual a 7, exiba "Aprovado". Caso contrário, exiba "Reprovado". Use if/else.
 */

fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toDouble()

    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toDouble()

    val media = (nota1 + nota2) / 2

    if (media >= 7) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }
}
