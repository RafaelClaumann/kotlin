package com.claumann

fun main() {
    var foo = 10
    var bar = 5

    if (foo > bar) {
        println("foo($foo) é maior que bar($bar)")
    }

    if (bar < foo) {
        println("bar($bar) é menor que foo($foo)")
    }

    if (foo > bar && foo != bar) {
        println("foo($foo) é maior que bar($bar)")
        println("foo($foo) é diferente de bar($bar)")
    }

    if (foo != bar) {
        println("foo($bar) é diferente de bar($foo)")
    }

    var fee = 10
    if (foo == fee) {
        println("foo($foo) é igual a fee($fee)")
    }
    if (foo >= fee) {
        println("foo($foo) é maior ou igual a fee($fee)")
    }

    /**
     * Diferença entre == e ===
     *  == : Verifica se os valores dos objetos são equivalentes.
     *       É útil quando você deseja comparar o conteúdo dos objetos.
     *  ===: Verifica se os dois operandos referenciam o mesmo objeto.
     *       É útil quando você precisa saber se duas variáveis estão apontando para o mesmo local na memória.
     *
     *  Para tipos primitivos (como Int, Boolean, etc.), === e == têm o mesmo efeito, pois esses tipos são
     *  representados como valores e não como referências.
     */
    val a = Carro("Fusca", 1973)
    val b = Carro("Fusca", 1973)

    // TRUE
    // São referencias diferentes, mas seus atributos são iguais
    // e, portanto, o metodo equals de Carro retorna true
    if (a == b) {
        println("$a é igual a $b usando ==")
    }

    // FALSE
    // Apesar de possuirem atributos com mesmos valores, a e b são
    // referencias diferentes
    if (a === b) {
        println("$a é igual a $b usando ===")
    }

}

class Carro(val modelo: String, val ano: Int) {
    fun mostrarDetalhes() {
        println("Modelo: $modelo, Ano: $ano")
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true // Verifica se as referências são iguais
        if (other !is Carro) return false // Verifica se o objeto é da mesma classe
        return modelo == other.modelo && ano == other.ano // Compara as propriedades
    }
}