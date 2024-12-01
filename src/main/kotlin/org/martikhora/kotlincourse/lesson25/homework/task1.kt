package org.martikhora.kotlincourse.lesson25.homework


const val message: String = "Hello, Kotlin!"

fun printConst() {
    println(message)
}

val printConst = fun() {
    println(message)
}

val printMessage: () -> Unit = {
    println(message)
}

val printMessageNoType = {
    println(message)
}

fun main() {

    printConst()

    printConst()

    printMessage()

    printMessageNoType()
}