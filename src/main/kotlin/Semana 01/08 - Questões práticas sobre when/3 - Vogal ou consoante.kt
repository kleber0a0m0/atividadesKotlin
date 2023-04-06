/*
Faça um programa que receba uma letra e verifique se ela é uma vogal ou consoante usando when.
 */

fun main() {
    println("Digite uma letra:")
    val letra = readLine()?.lowercase()?.get(0)

    when (letra) {
        'a', 'e', 'i', 'o', 'u' -> println("Vogal")
        in 'a'..'z' -> println("Consoante")
        else -> println("Não é uma letra")
    }
}
