/*
Crie uma função que receba um número variável de argumentos do tipo Int. e
retorne a soma dos mesmos.
*/fun soma(vararg numeros: Int): Int {

    var resultado = 0
    for (numero in numeros) {
        resultado += numero
    }
    return resultado
}

fun main() {
    val resultado = soma(1, 2, 3, 4, 5)
    println(resultado)

}
