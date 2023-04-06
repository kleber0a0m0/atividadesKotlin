//3 - Faça um loop while que imprima todos os números ímpares de 10 a 0:
fun main(args: Array<String>) {
    var index = 10
    while (0 < index) {
        if(index%2==1){
            println(index)
        }
        index--
    }
}