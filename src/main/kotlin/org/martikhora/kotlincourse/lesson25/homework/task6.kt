package org.martikhora.kotlincourse.lesson25.homework

//Создай функцию расширение словаря из строк и чисел, которая принимает число и возвращает список ключей,
//длина которых меньше их значений, но больше заданного в функции аргумента.
//В случае если список получается пустой нужно выкинуть исключение IllegalState.
//По аналогии с предыдущим заданием выполни трансформации и проверки.

val keysLengthAnonymous: (Map<String, Int>, Int) -> List<String> =
    fun(map: Map<String, Int>, minLength: Int): List<String> {
        val result = map.filterKeys { (it.length < map[it]!!) && (it.length > minLength) }.keys.toList()
        require(result.isNotEmpty()) { "Список не должен быть пустым" }
        return result
    }

val keysLengthLambda: (Map<String, Int>, Int) -> List<String> = { map, minLength ->
    val result = map.filterKeys { (it.length < map[it]!!) && (it.length > minLength) }.keys.toList()
    require(result.isNotEmpty()) { "Список не должен быть пустым" }
    result
}

val keysLengthLambdaNoType = { map: Map<String, Int>, minLength: Int ->
    val result = map.filterKeys { (it.length < map[it]!!) && (it.length > minLength) }.keys.toList()
    require(result.isNotEmpty()) { "Список не должен быть пустым" }
    result
}

fun main() {
    val map = mapOf("Hello" to 7, "Kotlin" to 8)
    val emptyMap = emptyMap<String, Int>()

    println(map.keysLength(2))
    println(keysLengthAnonymous(map, 2))
    println(keysLengthLambda(map, 2))
    println(keysLengthLambdaNoType(map, 2))

    try {
        println(emptyMap.keysLength(2))
        println(keysLengthAnonymous(emptyMap, 2))
        println(keysLengthLambda(emptyMap, 2))
        println(keysLengthLambdaNoType(emptyMap, 2))
    } catch (e: Exception) {
        println(e.message)
    }
}