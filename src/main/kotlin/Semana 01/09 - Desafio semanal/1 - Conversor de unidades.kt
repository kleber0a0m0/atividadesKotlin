/*
Suponha que você está criando um aplicativo de conversão de unidades para ajudar as
pessoas a converter diferentes tipos de unidades, como temperatura, distância e tempo. O
aplicativo deve permitir que o usuário escolha a unidade de origem e a unidade de destino,
e depois exibir o resultado da conversão.

Crie um programa em Kotlin que faça o seguinte:

    1. Pergunte ao usuário qual tipo de unidade ele deseja converter: temperatura,
    distância ou tempo.

    2. De acordo com a resposta do usuário, pergunte qual é a unidade de origem e qual é
    a unidade de destino.

    3. Com base nas unidades escolhidas pelo usuário, faça a conversão adequada. Use o
    if/else para verificar o tipo de unidade escolhido e o when para verificar as unidades
    de origem e destino escolhidas pelo usuário.

    4. Exiba o resultado da conversão para o usuário.

Por exemplo, se o usuário escolher converter uma temperatura de Celsius para Fahrenheit,
o programa deve perguntar qual é a temperatura em Celsius, e então converter para
Fahrenheit usando a fórmula apropriada (F = C * 9/5 + 32). Se o usuário escolher converter
uma distância de metros para quilômetros, o programa deve perguntar qual é a distância em
metros, e então converter para quilómetros (1 km = 1000 m). Se o usuário escolher
converter um tempo de horas para minutos, o programa deve perguntar quantas horas são,
e então converter para minutos (1 hora = 60 minutos).
 */

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Qual tipo de unidade você deseja converter?")
    println("1 - Temperatura")
    println("2 - Distância")
    println("3 - Tempo")
    val tipoUnidade = scanner.nextInt()

    when (tipoUnidade) {
        1 -> {
            println("Qual é a unidade de origem?")
            println("1 - Celsius")
            println("2 - Fahrenheit")
            val unidadeOrigem = scanner.nextInt()

            println("Qual é a unidade de destino?")
            println("1 - Celsius")
            println("2 - Fahrenheit")
            val unidadeDestino = scanner.nextInt()

            println("Qual é a temperatura em ${if (unidadeOrigem == 1) "Celsius" else "Fahrenheit"}?")
            val temperatura = scanner.nextDouble()

            val temperaturaConvertida = if (unidadeOrigem == 1 && unidadeDestino == 2) temperatura * 9 / 5 + 32 else (temperatura - 32) * 5 / 9
            println("A temperatura convertida é $temperaturaConvertida ${if (unidadeDestino == 1) "Celsius" else "Fahrenheit"}")
        }
        2 -> {
            println("Qual é a unidade de origem?")
            println("1 - Metros")
            println("2 - Quilômetros")
            val unidadeOrigem = scanner.nextInt()

            println("Qual é a unidade de destino?")
            println("1 - Metros")
            println("2 - Quilômetros")
            val unidadeDestino = scanner.nextInt()

            println("Qual é a distância em ${if (unidadeOrigem == 1) "metros" else "quilômetros"}?")
            val distancia = scanner.nextDouble()

            val distanciaConvertida = if (unidadeOrigem == 1 && unidadeDestino == 2) distancia / 1000 else distancia * 1000
            println("A distância convertida é $distanciaConvertida ${if (unidadeDestino == 1) "metros" else "quilômetros"}")
        }
        3 -> {
            println("Qual é a unidade de origem?")
            println("1 - Horas")
            println("2 - Minutos")
            val unidadeOrigem = scanner.nextInt()

            println("Qual é a unidade de destino?")
            println("1 - Horas")
            println("2 - Minutos")
            val unidadeDestino = scanner.nextInt()

            println("Quantas ${if (unidadeOrigem == 1) "horas" else "minutos"} são?")
            val tempo = scanner.nextInt()

            val tempoConvertido = if (unidadeOrigem == 1 && unidadeDestino == 2) tempo * 60 else tempo / 60
            println("O tempo convertido é $tempoConvertido ${if (unidadeDestino == 1) "horas" else "minutos"}")
        }
    }
}

