package org.martikhora.kotlincourse.lesson27.homework


fun main() {
    val person = Person("Иван", 36).also {
        beautifyPrint(it)
    }
}

fun beautifyPrint(person: Person) {
    println("Это будет красивый вывод информации!")
    println("Имя: ${person.name}")
    println("Возраст: ${person.age}")
}


