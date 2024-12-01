package org.martikhora.kotlincourse.lesson25.homework

//Создай функцию, которая принимает список строк и число, а возвращает список из строк,
//длина которых больше или равна заданному числу. Если список пуст, нужно выкинуть исключение.
//По аналогии с предыдущим заданием выполни трансформации и проверки.

fun stringSize(strings: List<String>, size: Int): List<String> {
    require(strings.isNotEmpty()) { "Список не может быть пустым" }
    return strings.filter { it.length >= size }
}

val stringSizeAnon: (List<String>, Int) -> List<String> = fun(strings: List<String>, minLength: Int): List<String> {
    require(strings.isNotEmpty()) { "Список не должен быть пустым" }
    return strings.filter { it.length >= minLength }
}

val stringSizeLambda: (List<String>, Int) -> List<String> = { strings, minLength ->
    require(strings.isNotEmpty()) { "Список не должен быть пустым" }
    strings.filter { it.length >= minLength }
}

val stringSizeLambdaNoType = { strings: List<String>, minLength: Int ->
    require(strings.isNotEmpty()) { "Список не должен быть пустым" }
    strings.filter { it.length >= minLength }
}

fun main() {
    val strings1 = listOf("Hello", "," ,"Kotin")
    val strings2 = emptyList<String>()

    println(stringSize(strings1, 3))
    println(stringSizeAnon(strings1, 3))
    println(stringSizeLambda(strings1, 3))
    println(stringSizeLambdaNoType(strings1, 3))

    try {
        println(stringSize(strings2, 0))
        println(stringSizeAnon(strings2, 0))
        println(stringSizeLambda(strings2, 0))
        println(stringSizeLambdaNoType(strings2, 0))
    } catch (e: Exception) {
        println(e.message)
    }
}
