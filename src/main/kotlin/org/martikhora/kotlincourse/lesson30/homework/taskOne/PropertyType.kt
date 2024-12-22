package org.martikhora.kotlincourse.lesson30.homework.taskOne

enum class PropertyType(val displayName: String) {
        APARTMENT("Квартира"),
        HOUSE("Дом"),
        STUDIO("Студия"),
        LOFT("Лофт"),
        VILLA("Вилла"),
        TOWNHOUSE("Таунхаус"),
        BUNGALOW("Бунгало"),
        PENTHOUSE("Пентхаус")
}

fun printSortedPropertyTypes() {
    PropertyType.values()
        .sortedBy { it.displayName.length }
        .forEach { println(it.displayName) }
}

fun main() {
    printSortedPropertyTypes()
}