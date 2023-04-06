/*
Faça um loop do-while que peça ao usuário para digitar um número de 1 a 10 até
que ele acerte o número sorteado:
 */

fun main(args: Array<String>) {
    val numeroSorteado = 7
    var num: Int

    do {
        print("Digite um número de 1 a 10: ")
        num = readLine()!!.toInt()
    } while (num != numeroSorteado)

    println("Parabéns! Você acertou o número sorteado.")
}
