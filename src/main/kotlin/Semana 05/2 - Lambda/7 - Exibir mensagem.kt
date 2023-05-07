/*
7 - Como posso usar uma função de ordem superior para imprimir uma mensagem n
vezes em Kotlin?
 */
fun repetirMensagem(n: Int, mensagem: () -> Unit) {
    for (i in 1..n) {
        mensagem()
    }
}

fun main() {
    repetirMensagem(3) { println("Hello, world!") }
}
