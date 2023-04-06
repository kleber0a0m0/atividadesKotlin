/*
Faça um programa que verifique se um animal é um mamífero, ave ou réptil usando when.
 */

fun main() {
    println("Digite o nome de um animal:")
    val animal = readLine()

    when (animal) {
        "cachorro", "gato", "leão", "elefante" -> println("Mamífero")
        "papagaio", "coruja", "águia" -> println("Ave")
        "cobra", "jacaré", "tartaruga" -> println("Réptil")
        else -> println("Animal desconhecido")
    }
}
