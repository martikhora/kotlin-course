package org.martikhora.kotlincourse.lesson20.homework

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}