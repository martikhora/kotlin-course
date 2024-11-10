package org.martikhora.kotlincourse.lesson20.homework

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}