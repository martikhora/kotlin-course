package org.martikhora.kotlincourse.lesson17.homework

class University(name: String, location: String, faculties: List<String>) : EducationalInstitution(name, location) {

    val faculty: String = faculties.joinToString()

    override fun getDescription(): String {
        return "$name, Местоположение: $location, Факультеты: $faculty"
    }

}