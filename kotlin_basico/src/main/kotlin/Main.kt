package com.claumann

fun main(args: Array<String>) {

    // mutavel
    var nome = "rafael"
    nome = "claumann"

    // imutavel
    val  idade = 28
    // idade = 30 // 'val' cannot be reassigned.

    println(nome)
    print(idade)
}