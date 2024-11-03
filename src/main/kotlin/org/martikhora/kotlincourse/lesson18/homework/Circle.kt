package org.martikhora.kotlincourse.lesson18.homework

class Circle(private val radius: Double) : Shape() {

    override fun area(): Double {
        return Math.PI * radius * radius
    }
}