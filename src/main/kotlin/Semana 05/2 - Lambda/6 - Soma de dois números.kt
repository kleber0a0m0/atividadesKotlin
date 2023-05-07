/*
Como posso usar uma função de ordem superior para criar uma função que retorna
a soma de dois números em Kotlin?
 */
fun somaNumeros(num1: () -> Int, num2: () -> Int): Int {
    return num1() + num2()
}


fun main() {
    val a = 10
    val b = 20

    val resultado = somaNumeros({ a }, { b })

    println("A soma de $a e $b é $resultado")

}
