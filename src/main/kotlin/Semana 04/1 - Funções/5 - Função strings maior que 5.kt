/*
Crie uma função que receba um array de strings como argumento e retorne uma
nova lista contendo apenas as strings que possuem mais de 5 caracteres.
 */

fun stringsComMaisDe5Caracteres(lista: Array<String>): List<String> {
    val novaLista = mutableListOf<String>()
    for (str in lista) {
        if (str.length > 5) {
            novaLista.add(str)
        }
    }
    return novaLista
}


fun main() {
    val array = arrayOf("kleber", "josé", "pedro", "ana","marcelo");
    println(stringsComMaisDe5Caracteres(array));
}
