package org.martikhora.kotlincourse.lesson17.homework

import org.martikhora.kotlincourse.lesson17.homework.GeometricShape

open class Polygon(private val numberOfSides: Int) : GeometricShape() {

    val sides: Int
        get() = numberOfSides

    override fun area(): Double {
        return 0.0
    }

    override fun perimeter(): Double {
        return 0.0
    }

}