package org.martikhora.kotlincourse.lesson20.homework

abstract class Fridge : Powerable, Openable {

    open val capacity: Int = 0

    override fun close() {
    }



}