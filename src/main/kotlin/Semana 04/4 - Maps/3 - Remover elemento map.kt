/*
Como remover um elemento específico de um Map em Kotlin?
*/

fun main() {
    val coresRgb = mutableMapOf(
        "vermelho" to "#FF0000",
        "verde" to "#00FF00",
        "azul" to "#0000FF",
    )

    println(coresRgb)
    coresRgb.remove("verde")
    println(coresRgb)
}
