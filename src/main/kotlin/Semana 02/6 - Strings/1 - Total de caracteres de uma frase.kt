/*
Escreva um programa que leia uma frase do usuário e imprima quantos caracteres
ela possui usando length.
 */

fun main() {
    print("Digite uma frase: ")
    val frase = readLine()
    println("A frase tem ${frase?.length} caracteres.")
}
