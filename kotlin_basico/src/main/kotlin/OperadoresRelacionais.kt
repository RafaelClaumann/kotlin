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

}