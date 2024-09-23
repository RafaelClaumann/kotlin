package com.claumann

/**
 * String - texto
 * byte - (-127 a 127)
 * Int - (-2147483648 a 2147483647)
 * long - (-92233720268547755808 a 92233720268547755807)
 * float - (1.1234567 até 7 casas decimais)
 * double - (1.123456789 até 15 casas decimais)
 * boolean - (true ou false)
 */

fun main() {

    /**
     * Kotlin infere o tipo da variável a partir do seu valor
     * Também é possível definir o tipo de forma explicita
     *
     * Byte é o único que precisa ser explicito
     */
    var intValue = 30 // Int
    var byteValue: Byte = 28 // Byte
    // var errorValue: Byte = 130 // Expected 'kotlin. Byte', actual 'kotlin. Int'

    /**
     * Exemplo de como é possível ser redundante definindo o tipo explicitamente
     */
    var stringTypeInference = "Tem certeza que é uma String?" // String
    var stringTypeInferenceRedundant: String = "Definir o tipo explicitamente é redundante" // String
    var intTypeInferenceRedundant: Int = Integer.MIN_VALUE // int (-2147483648)

    /**
     * A razão pela qual a expressão var idade4 = Integer.MAX_VALUE + 1 não se torna um Long em Kotlin
     * é que a linguagem não faz promoção automática de tipos em operações aritméticas.
     *
     * Para evitar esse comportamento e garantir que a soma seja tratada como um Long, você deve
     * converter explicitamente os valores para Long antes da operação.
     */
    var maxPlusMaxStillInt = Integer.MAX_VALUE + Integer.MAX_VALUE // Int
    var noArithmeticPromotion = 2147483647 // Int - Integer.MAX_VALUE = 2147483647
    var promotionWithoutArithmetic = 2147483648 // Long - Integer.MAX_VALUE + 1
    var promotionBeforeAssign = Integer.MAX_VALUE.toLong() + 1 // Long
}
