package org.martikhora.kotlincourse.lesson25.homework

fun Map<String, Int>.keysLength(minLength: Int): List<String> {
    val result = this.filterKeys { it.length < this[it]!! && it.length > minLength }.keys.toList()
    require(result.isNotEmpty()) { "Список не должен быть пустым" }
    return result
}

fun Map<*, *>.printAndConcatenate(
    intValue: Int,
    doubleValue: Double,
    stringValue: String,
    booleanValue: Boolean,
    floatValue: Float,
    longValue: Long
): String {
    // Начинаем формировать строку с данными
    var result = ""

    // Добавляем данные из параметров
    result += "Int: $intValue\n"
    result += "Double: $doubleValue\n"
    result += "String: $stringValue\n"
    result += "Boolean: $booleanValue\n"
    result += "Float: $floatValue\n"
    result += "Long: $longValue\n"

    // Добавляем данные из словаря
    for ((key, value) in this) {
        result += "Key: $key; Value: $value\n"
    }

    // Печатаем все данные
    println(result)

    // Возвращаем результат
    return result
}


