/*
Faça um loop do-while que peça ao usuário para digitar um número até que ele
digite um número negativo:
 */

fun main(args: Array<String>) {
    var num: Int
    do {
        print("Digite um número: ")
        num = readLine()!!.toInt()
    } while (num >= 0)
}
