package org.martikhora.kotlincourse.lesson26.homework

//Напишите функцию filterStrings, которая принимает список строк и функцию-фильтр, оставляющую только строки,
//удовлетворяющие условию (то-есть принимающая строку и возвращающая булево значение). Функция должна вернуть результат
//фильтрации исходного списка строк.

fun filterStrings(
    listString: List<String>,
    filter: (String) -> Boolean,
): List<String> {

    return listString.filter(filter)

}

fun main() {
    val stringList = listOf("Kotlin", "Java", "Scala", "Python")

    val filteredList = filterStrings(stringList) { it.length > 5 } // Фильтр строк длиной больше 5
    println(filteredList)

    val anotherFilteredList = filterStrings(stringList) { it.contentEquals("Java") }
    println(anotherFilteredList)
}