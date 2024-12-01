package org.martikhora.kotlincourse.lesson25.homework

fun Map<String, Int>.keysLength(minLength: Int): List<String> {
    val result = this.filterKeys { it.length < this[it]!! && it.length > minLength }.keys.toList()
    require(result.isNotEmpty()) { "Список не должен быть пустым" }
    return result
}