package com.claumann

import java.math.BigInteger
import java.util.Arrays

fun main(args: Array<String>) {
    var numeros = arrayOf(1, 2, 3, 4, 5)
    numeros.forEach { item -> print(item) }
    println("Numeros [2]: ${numeros[2]}")
    println("Numeros [2]: ${numeros.get(2)}")
    println()

    var quadadros = Array(5) { it * it }
    quadadros.forEach { item -> print(item) }
    println()

    println(Arrays.toString(quadadros)) // [0, 1, 4, 9, 16]
    println(quadadros.contentToString()) // [0, 1, 4, 9, 16]

    var arrayHeterogeneo = arrayOf(1, Integer.valueOf("5"), "rafael", "diferente", BigInteger.ONE, numeros)
    println("Recuperando Int [0]: ${arrayHeterogeneo[0]}")
    println("Recuperando String [2]: ${arrayHeterogeneo[2]}")
    println("Recuperando BigInteger [4]: ${arrayHeterogeneo[4]}")

    var arrayRecuperado = arrayHeterogeneo[5] as Array<*>
    println("Recuperando Array [5]: ${arrayRecuperado.contentToString()}")


    var letras = arrayOf("a", "b", "c")
    numeros = arrayOf(1, 2, 3)

    // Combinando letras e números
    val combinados = letras.zip(numeros)
    println("Combinados: $combinados")  // [(a, 1), (b, 2), (c, 3)]

    // Pegando os 3 primeiros elementos
    val primeirosTres = numeros.take(3)
    println("Primeiros três: $primeirosTres")  // [1, 2, 3]

    // Removendo os 2 primeiros elementos
    val semDoisPrimeiros = numeros.drop(2)
    println("Sem os dois primeiros: $semDoisPrimeiros")  // [3]

    // Agrupando por paridade (números pares e ímpares)
    val agrupadosPorParidade = numeros.groupBy { it % 2 == 0 }
    println("Agrupados por paridade: $agrupadosPorParidade") // {false=[1, 3, 5], true=[2, 4, 6]}
}