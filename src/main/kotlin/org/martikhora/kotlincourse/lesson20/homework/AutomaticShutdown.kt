package org.martikhora.kotlincourse.lesson20.homework

interface AutomaticShutdown {

    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()

}