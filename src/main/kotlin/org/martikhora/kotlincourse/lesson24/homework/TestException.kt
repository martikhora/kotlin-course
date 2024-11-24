package org.martikhora.kotlincourse.lesson24.homework

class TestException (message: String) : AssertionError(message) {

}

fun main() {
    throw TestException ("Здравствуйте вы получили исключение")
}