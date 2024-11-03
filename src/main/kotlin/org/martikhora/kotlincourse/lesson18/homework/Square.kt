package org.martikhora.kotlincourse.lesson18.homework

class Square(private val sideA: Double, private val sideB: Double) : Shape() {

    override fun area(): Double {
        return sideA * sideB
    }
}