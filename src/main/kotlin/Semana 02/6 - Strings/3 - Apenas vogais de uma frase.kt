/*
Escreva um programa que leia uma frase do usuário e imprima apenas as vogais da
frase usando loop for e if.
 */

fun main() {
    print("Digite uma frase: ")
    val frase = readLine()
    println("Vogais:")
    for (i in 0 until frase!!.length) {
        val letra = frase[i].lowercaseChar()
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            print(letra)
        }
    }
}
