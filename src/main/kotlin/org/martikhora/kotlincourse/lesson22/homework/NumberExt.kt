package org.martikhora.kotlincourse.lesson22.homework

fun Number.within(other: Number, deviation: Number): Boolean {
    // Используем absoluteValue, чтобы получить абсолютное значение разницы
    return (this.toDouble() - other.toDouble()).absoluteValue() <= deviation.toDouble()
}

fun Double.absoluteValue(): Double = if (this < 0) -this else this //расширение для абсолютного значения

//    val num1: Number = 8
//    val num2: Number = 9
//    val deviation1: Number = 1
//
//    println("${num1} within ${num2} with deviation ${deviation1}: ${num1.within(num2, deviation1)}")

//    val num3: Number = 15
//    val num4: Number = 10
//    val deviation2: Number = 4
//
//    println("${num3} within ${num4} with deviation ${deviation2}: ${num3.within(num4, deviation2)}"

//    val num5: Number = -3.5
//    val num6: Number = 0.5
//    val deviation3: Number = 3.0
//
//    println("${num5} within ${num6} with deviation ${deviation3}: ${num5.within(num6, deviation3)}")