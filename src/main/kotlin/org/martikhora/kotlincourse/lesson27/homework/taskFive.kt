package org.martikhora.kotlincourse.lesson27.homework

fun main() {
    val personForRun = Person("Иван", 36)

    val employeeRun = run {
        Employee(personForRun.name, personForRun.age, "qa lead").apply {
            email = "123456@mail.com" // Используем имя из Person для email
            department = "IT" // Указываем отдел
        }
    }
}