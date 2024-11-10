package org.martikhora.kotlincourse.lesson20.homework

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int) {
        val water = 0
        println("Залито $water литров воды")
    }
    fun getWater(amount: Int) {

    }
}