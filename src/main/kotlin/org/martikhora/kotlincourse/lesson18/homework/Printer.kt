package org.martikhora.kotlincourse.lesson18.homework

abstract class Printer {

    open fun print(string: String) {

    }

    protected fun splitTextIntoWords(text: String): List<String> {
        return text.split("\\s+".toRegex())
    }

}