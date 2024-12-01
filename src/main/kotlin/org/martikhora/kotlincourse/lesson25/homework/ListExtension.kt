package org.martikhora.kotlincourse.lesson25.homework

fun List<Int>.uniqueNumbers(numbers: List<Int>): List<Int> {
    require(numbers.isNotEmpty()) {"Список не может быть пустым"}
    return this.distinct()
}