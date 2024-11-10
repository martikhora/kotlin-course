package org.martikhora.kotlincourse.lesson20.homework

abstract class ProgrammableDevice : PoweredDevice(), Programmable {
    override fun programAction(action: String) {
        if (isDevicePowered()) {
            println("Программирование устройства на действие: '$action'.")
        } else {
            println("Невозможно программировать, устройство выключено.")
        }
    }

    override fun execute() {
        if (isDevicePowered()) {
            println("Выполнение запланированного действия.")
        } else {
            println("Невозможно выполнить действие, устройство выключено.")
        }
    }
}// Абстрактный класс оборудования с возможностью устанавливать температуру и открываться&lt;br&gt;