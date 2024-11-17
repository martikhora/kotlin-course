package org.martikhora.kotlincourse.lesson22.homework

fun Long?.toStringOrNull(): String {
    return this?.toString() ?: "NULL"
}

//    val number1: Long? = 12345L
//    val number2: Long? = null
//
//    println("Число 1: ${number1.toStringOrNull()}")
//    println("Число 2: ${number2.toStringOrNull()}")