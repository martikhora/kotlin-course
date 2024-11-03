package org.martikhora.kotlincourse.lesson17.homework

import kotlin.math.sqrt

class Triangle(
    private val sideA: Double, private val sideB: Double,
    private val sideC: Double
) : Polygon(3) {

    override fun area(): Double {
        val s = (sideA + sideB + sideC) / 2
        return sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }

    override fun perimeter(): Double {
        return sideA + sideB + sideC
    }

}