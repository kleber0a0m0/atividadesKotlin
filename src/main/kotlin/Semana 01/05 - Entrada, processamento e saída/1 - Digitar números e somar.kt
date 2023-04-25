/*
Faça um programa que peça ao usuário para digitar dois números e mostre a `Semana 04`.`1 - Funções`.`Semana 04`.`1 - Funções`.soma desses números.
 */

fun main() {
    println("Digite o primeiro número:")
    val numero1 = readLine()?.toInt() ?: 0
    println("Digite o segundo número:")
    val numero2 = readLine()?.toInt() ?: 0
    val soma = numero1 + numero2
    println("A `Semana 04`.`1 - Funções`.`Semana 04`.`1 - Funções`.soma dos números é $soma")
}
