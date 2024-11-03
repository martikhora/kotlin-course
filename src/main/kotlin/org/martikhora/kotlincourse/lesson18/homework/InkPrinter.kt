package org.martikhora.kotlincourse.lesson18.homework

class InkPrinter : Printer() {

    private val colorPairs = listOf(
        Pair("\u001B[31m", "\u001B[47m"),
        Pair("\u001B[32m", "\u001B[46m"),
        Pair("\u001B[33m", "\u001B[45m"),
        Pair("\u001B[34m", "\u001B[44m"),
        Pair("\u001B[35m", "\u001B[43m")
    )

    override fun print(text: String) {
        val words = splitTextIntoWords(text)
        for ((index, word) in words.withIndex()) {
            val colorPair = colorPairs[index % colorPairs.size]
            println("${colorPair.first}${colorPair.second}$word\u001B[0m")
        }
    }
}