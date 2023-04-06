/*
Escreva um programa que leia uma frase do usuário e imprima a mesma frase em
ordem inversa usando loop for.
 */

fun main() {
    print("Digite uma frase: ")
    val frase = readLine()
    println("Frase invertida:")
    for (i in frase!!.length - 1 downTo 0) {
        print(frase[i])
    }
}
