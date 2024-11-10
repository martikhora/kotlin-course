package org.martikhora.kotlincourse.lesson20.homework

class Refrigerator: TemperatureControllableDevice(), WaterContainer {

    override val maxTemperature: Int = 5

    override val capacity: Int
        get() = 5

    override fun fillWater(amount: Int) {
        println("Заполнение холодильника водой на $amount литров.")
    }
    override fun getWater(amount: Int) {
        println("Получение $amount литров воды из холодильника.")
    }

}