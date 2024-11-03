package org.martikhora.kotlincourse.lesson18.homework

class Logger {

    fun log(message: String) {
        println("\u001B[34mINFO: $message\u001B[0m")
    }


    fun log(level: String, message: String) {
        when (level) {
            "WARNING" -> println("\u001B[33mWARNING: $message\u001B[0m")
            "ERROR" -> println("\u001B[41mERROR:$message\u001B[41m ")
            "DEBUG" -> println("\u001B[0mDEBUG: $message\u001B[0m")
            else -> log(message)
        }
    }

    fun log(messages: List<String>) {
        for (message in messages) {
            log(message)
        }
    }

    fun log(exception: Exception) {
        log("ERROR", exception.message ?: "Unknown error occurred.")
    }
}