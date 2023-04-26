/*
Crie uma função que receba um array de strings e um caractere como argumentos e
retorne uma nova lista contendo apenas as strings que começam com o caractere
informado.
 */

fun filtraStrings(strings: Array<String>, caractere: Char): List<String> {
    val filtradas = mutableListOf<String>()
    for (string in strings) {
        if (string.isNotEmpty() && string[0] == caractere) {
            filtradas.add(string)
        }
    }
    return filtradas
}


fun main() {
    val strings = arrayOf("banana", "maçã", "abacaxi", "uva", "melancia")
    val filtradas = filtraStrings(strings, 'm')
    println(filtradas)
}