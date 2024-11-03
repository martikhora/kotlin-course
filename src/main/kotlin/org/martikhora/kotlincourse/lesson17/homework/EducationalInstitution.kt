package org.martikhora.kotlincourse.lesson17.homework

open class EducationalInstitution(val name: String, val location: String) {

    open fun getDescription(): String {
        return "Учебное Заведение: $name, Местоположение: $location"
    }

}