package org.martikhora.kotlincourse.lesson22.homework

fun <K, T> Map<K, List<T?>>.filterBySize(minSize: Number): Map<String, T?> {
    val resultMap = mutableMapOf<String, T?>()

    for ((key, value) in this) {
        if (value.size > minSize.toInt()) {
            // добавляем ключ и первый элемент из списка значений в новый словарь
            resultMap[key.toString()] =
                value.firstOrNull() // Используем firstOrNull для получения первого элемента или null
        }
    }
    return resultMap
}

//    val inputMap: Map<Int?, List<String?>> = mapOf(
//        1 to listOf("A", "B", "C"),
//        2 to listOf("D"),
//        null to listOf("E", "F", "G")
//    )
//    val filteredMap = inputMap.filterBySize(1)
//    println("Отфильтрованный словарь: $filteredMap")