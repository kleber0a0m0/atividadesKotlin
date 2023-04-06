/*
Escreva um programa que crie um array de 10 strings com nomes de frutas e
imprima somente as frutas que começam com a letra "a" usando loop for e if.
 */

fun main() {
    val frutas = arrayOf("abacaxi", "acerola", "amora", "abacate", "banana", "caqui", "cereja", "damasco", "framboesa", "goiaba")

    for (fruta in frutas) {
        if (fruta.startsWith("a")) {
            println(fruta)
        }
    }
}
