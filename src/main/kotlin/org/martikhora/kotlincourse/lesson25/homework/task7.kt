package org.martikhora.kotlincourse.lesson25.homework

//Создай функцию расширения словаря из списка и множества, которая принимает все известные тебе типы
//(вспомни все что знаешь и под каждый тип создай аргумент) и возвращает строку.
//Функция должна распечатать все данные, которые тебе в ней доступны и вернуть конкатенацию всех данных
//которые ей доступны (порядок неважен). Конкатенация - это присоединение.
//Код должен быть отформатирован таким образом, чтобы легко читался.

val printAndConcatenateAnon: (Map<List<Any>, Set<Any>>) -> String = { map ->

    var result = ""

    val intValue = 10
    val doubleValue = 20.5
    val stringValue = "Hello, World!"
    val booleanValue = true
    val charValue = 'A'
    val byteValue: Byte = 127
    val shortValue: Short = 30000
    val longValue = 100000L
    val floatValue = 15.5f

    for ((key, value) in map) {
        result += "Key: $key; Value: $value\n"
    }

    result += "Int: $intValue\n"
    result += "Double: $doubleValue\n"
    result += "String: $stringValue\n"
    result += "Boolean: $booleanValue\n"
    result += "Char: $charValue\n"
    result += "Byte: $byteValue\n"
    result += "Short: $shortValue\n"
    result += "Long: $longValue\n"
    result += "Float: $floatValue\n"

    println(result)

    result
}

val printAndConcatLambda: (Map<List<Any>, Set<Any>>) -> String = { map ->

    var result = ""

    val intValue = 10
    val doubleValue = 20.5
    val stringValue = "Hello, World!"
    val booleanValue = true
    val charValue = 'A'
    val byteValue: Byte = 127
    val shortValue: Short = 30000
    val longValue = 100000L
    val floatValue = 15.5f

    for ((key, value) in map) {
        result += "List Key: ${key.joinToString(", ")}; Set Value: ${value.joinToString(", ")}\n"
    }

    result += "Int: $intValue\n"
    result += "Double: $doubleValue\n"
    result += "String: $stringValue\n"
    result += "Boolean: $booleanValue\n"
    result += "Char: $charValue\n"
    result += "Byte: $byteValue\n"
    result += "Short: $shortValue\n"
    result += "Long: $longValue\n"
    result += "Float: $floatValue\n"

    println(result)

    result
}

val printAndConcatLambdaNoType = { map: Map<List<Any>, Set<Any>> ->
    var result = ""

    val intValue = 10
    val doubleValue = 20.5
    val stringValue = "Hello, World!"
    val booleanValue = true
    val charValue = 'A'
    val byteValue: Byte = 127
    val shortValue: Short = 30000
    val longValue = 100000L
    val floatValue = 15.5f

    for ((key, value) in map) {
        result += "List Key: ${key.joinToString(", ")}; Set Value: ${value.joinToString(", ")}\n"
    }

    result += "Int: $intValue\n"
    result += "Double: $doubleValue\n"
    result += "String: $stringValue\n"
    result += "Boolean: $booleanValue\n"
    result += "Char: $charValue\n"
    result += "Byte: $byteValue\n"
    result += "Short: $shortValue\n"
    result += "Long: $longValue\n"
    result += "Float: $floatValue\n"

    println(result)

    result
}

fun main() {
    val int = 10
    val double = 20.5
    val string = "Hello, World!"
    val boolean = true
    val float = 15.5f
    val long = 100000L


    val map = mapOf(
        listOf("apple", "orange") to setOf(1, 2, 3),
        listOf("banana") to setOf(4, 5),
        listOf(" ") to setOf(6, 7, 8, 9)
    )
}

