package org.martikhora.kotlincourse.lesson21.homework

class StringValidator : Validator<String?> {

    override fun validate(value: String?): Boolean {
        //строка не null, не пустая и не состоит из пробелов
        return value != null && value.trim().isNotEmpty()
    }

}