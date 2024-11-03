package org.martikhora.kotlincourse.lesson18.homework

class LaserPrinter : Printer() {

    override fun print(text: String) {
        val words = splitTextIntoWords(text)
        for (word in words) {
            println("\u001B[30m$word\u001B[47m") // Чёрный текст на белом фоне&lt;br&gt;        }&lt;br&gt;        println("\u001B[0m") // Сброс цвета&lt;br&gt;    }&lt;br&gt;}&lt;br&gt;&lt;br&gt;// Класс InkjetPrinter, наследующий от Printer&lt;br&gt;class InkjetPrinter : Printer() {&lt;br&gt;    // Список пар цветов текста и фона&lt;br&gt;    private val colorPairs = listOf(&lt;br&gt;        Pair("\u001B[31m", "\u001B[47m"), // Красный текст на белом фоне&lt;br&gt;        Pair("\u001B[32m", "\u001B[46m"), // Зелёный текст на циан фоне&lt;br&gt;        Pair("\u001B[33m", "\u001B[45m"), // Жёлтый текст на пурпурном фоне&lt;br&gt;        Pair("\u001B[34m", "\u001B[44m"), // Синий текст на синем фоне&lt;br&gt;        Pair("\u001B[35m", "\u001B[43m")  // Пурпурный текст на жёлтом фоне&lt;br&gt;    )&lt;br&gt;&lt;br&gt;    override fun print(text: String) {&lt;br&gt;        val words = splitTextIntoWords(text)&lt;br&gt;        for ((index, word) in words.withIndex()) {&lt;br&gt;            // Получение цветовой пары по индексу&lt;br&gt;            val colorPair = colorPairs[index % colorPairs.size]&lt;br&gt;            println("${colorPair.first}${colorPair.second}$word\u001B[0m") // Разноцветный текст
        }
    }
}

// Класс InkjetPrinter, наследующий от Printer&lt;br&gt;class InkjetPrinter : Printer() {&lt;br&gt;
// Список пар цветов текста и фона&lt;br&gt;
// private val colorPairs = listOf(&lt;br&gt;        Pair("\u001B[31m", "\u001B[47m"),
// Красный текст на белом фоне&lt;br&gt;        Pair("\u001B[32m", "\u001B[46m"),
// Зелёный текст на циан фоне&lt;br&gt;        Pair("\u001B[33m", "\u001B[45m"),
// Жёлтый текст на пурпурном фоне&lt;br&gt;        Pair("\u001B[34m", "\u001B[44m"),
// Синий текст на синем фоне&lt;br&gt;        Pair("\u001B[35m", "\u001B[43m")
// Пурпурный текст на жёлтом фоне&lt;br&gt;    )&lt;br&gt;&lt;br&gt;
// override fun print(text: String) {&lt;br&gt;        val words = splitTextIntoWords(text)&lt;br&gt;
// for ((index, word) in words.withIndex()) {&lt;br&gt;
// Получение цветовой пары по индексу&lt;br&gt;            val colorPair = colorPairs[index % colorPairs.size]&lt;br&gt;
// println("${colorPair.first}${colorPair.second}$word\u001B[0m") // Разноцветный текст