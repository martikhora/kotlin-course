package org.martikhora.kotlincourse.lesson17.homework

open class Circle(private val radius: Double) : GeometricShape() {

    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }

}