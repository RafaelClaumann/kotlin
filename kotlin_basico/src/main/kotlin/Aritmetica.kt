package com.claumann

/**
 * Por que o main não precisa estar numa classe?
 * Funções de Nível Superior:
 *      Em Kotlin, você pode declarar funções fora de classes, o que é uma característica da linguagem.
 *      Isso significa que o metodo main pode ser uma função de nível superior, permitindo que você escreva código de forma
 *      mais concisa e direta.
 * Compilação em JVM:
 *      Quando você compila um arquivo Kotlin que contém um metodo main fora de uma classe, o compilador cria automaticamente
 *      uma classe para você. Por exemplo, se o arquivo se chama Main.kt, o compilador cria uma classe chamada MainKt.
 *      Assim, a função main se torna um metodo estático dessa classe.
 *      Isso permite que a função seja chamada como se estivesse numa classe quando executada na JVM.
 */
fun main() {

    var foo = 10
    var bar = 10
    println("Soma sem overflow Int: ${foo + bar}, Tipo: ${(foo + bar).javaClass.simpleName}")

    /**
     * Em Kotlin, quando ocorre um overflow em uma operação aritmética, o resultado "dobra" e continua a partir do
     * valor mínimo do tipo de dado.
     * Então, 2.147.483.647 + 10 resulta em -2.147.483.639.
     *
     * A variável soma recebe o valor -2.147.483.639, que é o resultado da soma de 10 e 2.147.483.647 após o overflow.
     *
     * Isso acontece porque Kotlin não faz promoção automática de tipos em operações aritméticas.
     * Mesmo que a soma resulte em um valor maior que o limite máximo de um Int, o tipo da variável soma ainda será inferido como Int.
     */
    bar = Integer.MAX_VALUE
    var somaInt = foo + bar // -2147483639 (Int)
    println("Soma com overflow Int: $somaInt, Tipo: ${somaInt.javaClass.simpleName}")

    var somaLong = foo.toLong() + bar.toLong() // 2147483657 = 2147483647 + 10 (Long)
    println("Soma com overflow Long: $somaLong, Tipo: ${somaLong.javaClass.simpleName}")


    /**
     * Resto da divisão
     */
    foo = 5
    bar = 2
    var restoDivisao = 5 % 2
    println("Soma com overflow Long: $restoDivisao, Tipo: ${restoDivisao.javaClass.simpleName}")

    /**
     * O valor da variável é incrementado em 1 antes de seu uso na expressão.
     * O valor incrementado é retornado pela expressão.
     */
    var x1 = 5
    val y1 = ++x1 // x = 6, y = 6

    println("Incremento ++valor: ${++foo}") // 6
    println("Valor incremento(++valor) pre-fixado: $foo") // 6

    /**
     * O valor original da variável é retornado pela expressão.
     * O valor da variável é incrementado em 1 após seu uso na expressão.
     */
    var x2 = 5
    val y2 = x2++ // x = 6, y = 5

    println("Incremento valor++: ${foo++}") // 6
    println("Valor incremento(valor++) pos-fixado: $foo") // 7
}