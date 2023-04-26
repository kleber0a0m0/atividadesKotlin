/*
Como verificar se um determinado elemento existe em um Map em Kotlin?
*/

fun main() {
    val coresRgb = mutableMapOf(
        "vermelho" to "#FF0000",
        "verde" to "#00FF00",
        "azul" to "#0000FF",
    )

    println(coresRgb)

    if (coresRgb.containsKey("verde")) {
        println("O mapa contém a cor verde.")
    } else {
        println("O mapa não contém a cor verde.")
    }
}
