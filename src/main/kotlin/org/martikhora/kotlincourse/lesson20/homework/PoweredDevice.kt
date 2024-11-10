package org.martikhora.kotlincourse.lesson20.homework

abstract class PoweredDevice : Powerable {
    private var isPoweredOn = false

    override fun powerOn() {
        isPoweredOn = true
        println("${this::class.simpleName} включен.")
    }

    override fun powerOff() {
        isPoweredOn = false
        println("${this::class.simpleName} выключен.")
    }

    fun isDevicePowered() = isPoweredOn
}