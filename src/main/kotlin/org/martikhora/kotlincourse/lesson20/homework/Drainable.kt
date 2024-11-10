package org.martikhora.kotlincourse.lesson20.homework

interface Drainable {
    fun connectToDrain() {
        val isConnected = false
    }
    fun drain() {
        println("Слив запущен")
    }
}