package org.martikhora.kotlincourse.lesson22.homework

fun <T> MutableList<T?>.getElementOrNull(element: T?, index: Number): T? {
    // Проверяем, что индекс в допустимых границах
    return if (index.toInt() in indices) {
        this[index.toInt()] // возвращаем элемент по индексу
    } else {
        null // возвращаем null, если индекса нет
    }
}

//    val mutableList: MutableList<String?> = mutableListOf("one", "two", null, "four")
//    val element1 = mutableList.getElementOrNull("three", 1) // Элемент по индексу 1
//    val element2 = mutableList.getElementOrNull("three", 5) // Индекс вне границ
//    println("Элемент по индексу 1: $element1")