package org.martikhora.kotlincourse.lesson27.homework

fun createEmployee(person: Person?): Employee? {
    return person.let {
        it?.let { it -> Employee(it.name, it.age, "разработчик") }
    }
}

fun main() {
    val person = Person("Иван", 30)

    val employee = createEmployee(person)

    println("Имя: ${employee?.name}, Возраст: ${employee?.age}, Должность: ${employee?.position}")
}

