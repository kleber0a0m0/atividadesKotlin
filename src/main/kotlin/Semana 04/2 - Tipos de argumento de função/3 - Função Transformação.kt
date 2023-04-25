/*
Crie uma função que receba uma função de transformação como argumento, um
array de números inteiros e retorne uma nova lista contendo os elementos do array
transformados pela função de transformação.
 */

fun transformaNumeros(numeros: Array<Int>, transformacao: (Int) -> Int): List<Int> {
    val transformados = mutableListOf<Int>()
    for (numero in numeros) {
        transformados.add(transformacao(numero))
    }
    return transformados
}

fun main() {
    val numeros = arrayOf(1, 2, 3, 4, 5)
    val duplicar: (Int) -> Int = { num -> num * 2 }
    val triplicar: (Int) -> Int = { num -> num * 3 }
    val transformadosDuplicar = transformaNumeros(numeros, duplicar)
    val transformadosTriplicar = transformaNumeros(numeros, triplicar)
    println(transformadosDuplicar)
    println(transformadosTriplicar)

}