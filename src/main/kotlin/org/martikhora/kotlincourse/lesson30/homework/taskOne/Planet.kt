package org.martikhora.kotlincourse.lesson30.homework.taskOne

enum class Planet(val distanceFromSun: Double, val weight: Double) {
    MERCURY(57.91, 0.330),
    VENUS(108.2, 4.87),
    EARTH(149.6, 5.97),
    MARS(227.9, 0.642),
    JUPITER(778.5, 1898.0),
    SATURN(1427.0, 568.0),
    URANUS(2871.0, 86.8),
    NEPTUNE(4497.1, 102.0)
}


fun findPlanet(filter: (Planet) -> Boolean): Planet {
    val filteredPlanets = Planet.values().filter(filter)
    if (filteredPlanets.isEmpty()) {
        throw NoSuchElementException("No planet matches the given criteria.")
    }
    return filteredPlanets.first()
}

fun main() {
    try {
        val planet = findPlanet { it.distanceFromSun < 100 } // фильтрация по расстоянию
        println("First planet found: $planet")
    } catch (e: NoSuchElementException) {
        println(e.message)
    }
    try {
        val planet = findPlanet { it.weight > 1000 } // фильтрация по весу
        println("First planet found: $planet")
    } catch (e: NoSuchElementException) {
        println(e.message)
    }
    try {
        val planet = findPlanet { it.distanceFromSun > 5000 } // фильтрация, которая не найдет планету
        println("First planet found: $planet")
    } catch (e: NoSuchElementException) {
        println(e.message) // Ожидается сообщение об ошибке
    }
}