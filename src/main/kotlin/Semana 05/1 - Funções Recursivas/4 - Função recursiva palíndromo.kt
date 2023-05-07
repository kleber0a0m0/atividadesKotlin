/*
Crie uma função recursiva que verifique se uma string é palíndromo.
 */
fun isPalindrome(str: String): Boolean {
    if (str.length <= 1) {
        return true
    } else if (str[0] != str[str.length - 1]) {
        return false
    } else {
        return isPalindrome(str.substring(1, str.length - 1))
    }
}

fun main() {
    val result = isPalindrome("radar")
    println(result);
}