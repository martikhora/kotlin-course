package org.martikhora.kotlincourse.lesson27.homework

fun main() {

    val personToEmployee = Person("Иван", 36)

    val employeeFromPerson = with(personToEmployee) {
        Employee(this.name, this.age, "IT Crew")

    }
}