package com.claumann

import java.util.Scanner

fun main() {
    /**
     * Concatenação de Strings
     */
    var nome = "Kotlin"
    var idade = 10
    var vendor = "JetBrains"

    // Java way - concatenation
    println("JAVA WAY - nome: " + nome + ", idade:" + idade + ", vendor: " + vendor)
    // Kotlin way - template
    println("KOTLIN WAY - nome: $nome, idade:$idade, vendor: $vendor")

    /**
     * Input com Scanner
     *
     * A razão pela qual System.in é escrito entre crases (`) é que "in" é uma palavra reservada em Kotlin.
     * Em Java, você precisa usar new para criar um objeto - new Scanner(System.in);.
     * Em Kotlin, você simplesmente chama o construtor diretamente sem a necessidade de new.
     */
    val scanner = Scanner(System.`in`)
    print("Quantos anos voce tem? ")
    var inputValue = scanner.nextInt()
    println(inputValue)
    scanner.close()
}