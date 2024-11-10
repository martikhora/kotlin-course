package org.martikhora.kotlincourse.lesson20.homework

abstract class TemperatureControllableDevice : ProgrammableDevice(), TemperatureRegulatable, Openable {
    abstract override val maxTemperature: Int
    override fun open() {
        if (isDevicePowered()) {
            println("${this::class.simpleName} открыт.")
        } else {
            println("Невозможно открыть, устройство выключено.")
        }
    }

    override fun close() {
        if (isDevicePowered()) {
            println("${this::class.simpleName} закрыт.")
        } else {
            println("Невозможно закрыть, устройство выключено.")
        }
    }
    override fun setTemperature(temp: Int) {
        if (isDevicePowered()) {
            println("Установка температуры на $temp°C.")
        } else if (!isDevicePowered()) {
            println("Невозможно установить температуру, устройство выключено.")
        } else {
            println("Температура $temp°C превышает максимальную: $maxTemperature°C.")
        }
    }
}