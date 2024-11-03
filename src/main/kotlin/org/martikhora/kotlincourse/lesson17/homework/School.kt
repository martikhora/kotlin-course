package org.martikhora.kotlincourse.lesson17.homework

class School(name: String, location: String, val numberOfStudents: Int) : EducationalInstitution(name, location) {

    override fun getDescription(): String {
        return "Школа: $name, Местоположение: $location, Количество учеников: $numberOfStudents"
    }

}