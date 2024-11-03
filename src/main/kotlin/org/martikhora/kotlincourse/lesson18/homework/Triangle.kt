package org.martikhora.kotlincourse.lesson18.homework

import kotlin.math.sin

class Triangle(private val sideA: Double, private val sideB: Double, private val angle: Double) : Shape() {

    override fun area(): Double {
        return 0.5 * sideA * sideB * sin(angle)
    }
}