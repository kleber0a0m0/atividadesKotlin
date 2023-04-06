/*
Desafio semanal:
Crie um programa em Kotlin que permita ao usuário digitar o nome e a idade de várias
pessoas, armazenando essas informações em um array de objetos Pessoa. O
programa deve ter as seguintes funcionalidades:

Exercícios - semana 2

    1 - Permitir ao usuário adicionar uma nova pessoa ao array, informando o nome e a
    idade.

    2 - Exibir a lista de todas as pessoas adicionadas ao array, mostrando o nome e a
    idade de cada uma.

    3 - Exibir a média de idade das pessoas adicionadas ao array.

    4 - Permitir ao usuário buscar uma pessoa pelo nome, exibindo o nome e a idade
    correspondentes.

    5 - Permitir ao usuário remover uma pessoa pelo nome, atualizando o array e exibindo
    a lista atualizada.

É aconselhado utilizar os conceitos de loop while, loop do-while, loop for, range,
continue, break & repeat, string e array.
 */

data class Pessoa(val nome: String, val idade: Int)

fun main() {
    val pessoas = mutableListOf<Pessoa>()

    while (true) {
        println("O que deseja fazer?\n" +
                "1 - Adicionar pessoa\n" +
                "2 - Ver lista de pessoas\n" +
                "3 - Ver média de idade das pessoas\n" +
                "4 - Buscar pessoa pelo nome\n" +
                "5 - Remover pessoa pelo nome\n" +
                "6 - Sair")
        val opcao = readLine()?.toIntOrNull() ?: continue

        when (opcao) {
            1 -> {
                println("Digite o nome da pessoa:")
                val nome = readLine() ?: continue
                println("Digite a idade da pessoa:")
                val idade = readLine()?.toIntOrNull() ?: continue
                pessoas.add(Pessoa(nome, idade))
                println("Pessoa adicionada com sucesso!")
            }
            2 -> {
                if (pessoas.isEmpty()) {
                    println("Nenhuma pessoa foi adicionada ainda.")
                } else {
                    println("Lista de pessoas:")
                    for (pessoa in pessoas) {
                        println("${pessoa.nome} - ${pessoa.idade} anos")
                    }
                }
            }
            3 -> {
                if (pessoas.isEmpty()) {
                    println("Nenhuma pessoa foi adicionada ainda.")
                } else {
                    val media = pessoas.map { it.idade }.average()
                    println("Média de idade das pessoas: $media anos")
                }
            }
            4 -> {
                println("Digite o nome da pessoa que deseja buscar:")
                val nome = readLine() ?: continue
                val pessoaEncontrada = pessoas.find { it.nome.equals(nome, ignoreCase = true) }
                if (pessoaEncontrada == null) {
                    println("Pessoa não encontrada.")
                } else {
                    println("${pessoaEncontrada.nome} - ${pessoaEncontrada.idade} anos")
                }
            }
            5 -> {
                println("Digite o nome da pessoa que deseja remover:")
                val nome = readLine() ?: continue
                val pessoaRemovida = pessoas.removeIf { it.nome.equals(nome, ignoreCase = true) }
                if (pessoaRemovida) {
                    println("Pessoa removida com sucesso!")
                } else {
                    println("Pessoa não encontrada.")
                }
            }
            6 -> {
                println("Encerrando programa...")
                return
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}
