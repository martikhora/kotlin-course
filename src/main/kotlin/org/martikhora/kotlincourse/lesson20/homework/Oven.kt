package org.martikhora.kotlincourse.lesson20.homework

class Oven : TemperatureControllableDevice() {

    override val maxTemperature: Int = 250

    fun bake() {
        if (isDevicePowered()) {
            println("Запуск выпечки.")
        } else {
            println("Невозможно начать выпечку, устройство выключено.")
        }
    }
}