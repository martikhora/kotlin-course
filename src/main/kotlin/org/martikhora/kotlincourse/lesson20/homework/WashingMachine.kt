package org.martikhora.kotlincourse.lesson20.homework

class WashingMachine(override val capacity: Int) : TemperatureControllableDevice(), Timeable, WaterContainer {

    override val maxTemperature: Int = 90

    override fun setTimer(time: Int) {
        println("Установка таймера на $time минут.")
    }
    override fun fillWater(amount: Int) {
        println("Заполнение стиральной машины водой на $amount литров.")
    }
}