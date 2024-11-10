package org.martikhora.kotlincourse.lesson20.homework

abstract class PowerDevice : Powerable{

    override fun powerOn() {
        println("Включен")
    }

    override fun powerOff() {
        println("Выключен")
    }

}