package org.martikhora.kotlincourse.lesson27.homework

fun main() {

    val employee = Employee("Ivan", 36, "qa-lead").apply {
        this.email = "abcd@mail.com"
        this.department = "IT-department"
    }


}
