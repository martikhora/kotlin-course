package org.martikhora.kotlincourse.lesson20.homework

class Kettle : TemperatureControllableDevice() {

    override val maxTemperature: Int = 100

    fun boilWater() {
        if (isDevicePowered()) {
            println("Кипячение воды.")
        } else {
            println("Невозможно вскипятить воду, устройство выключено.")
        }
    }
}