/*
Escreva um programa que leia um número inteiro positivo do usuário e imprima
todos os números pares de 0 até o número digitado, exceto o número 4, usando
continue e break.
 */

fun main(args: Array<String>) {
    print("Digite um número inteiro positivo: ")
    val num = readLine()!!.toInt()

    for (i in 0..num step 2) {
        if (i == 4) {
            continue
        }
        if (i == num) {
            break
        }
        println(i)
    }
}
