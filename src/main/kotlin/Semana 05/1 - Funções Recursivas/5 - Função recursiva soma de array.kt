/*
Crie uma função recursiva que verifique se uma string é palíndromo.
 */
fun sumArray(array: IntArray, index: Int = 0): Int {
    return if (index == array.size) {
        0
    } else {
        array[index] + sumArray(array, index + 1)
    }
}



fun main() {
    val myArray = intArrayOf(1, 2, 3, 4, 5)
    val result = sumArray(myArray) // result = 15
    println(result);
}