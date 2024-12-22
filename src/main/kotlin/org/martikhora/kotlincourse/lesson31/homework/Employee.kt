package org.martikhora.kotlincourse.lesson31.homework

import com.google.gson.GsonBuilder
import java.io.File

data class Employee(
    val name: String,
    val employed: Boolean,
    val birthDate: String,
    val position: CharacterTypes,
    val subordinates: List<Employee> = listOf()
)

fun createEmployeeHierarchy(): Employee {
    //Создаем сотрудников
    val qaEngineer = Employee("QA Engineer", true, "1990-05-20", CharacterTypes.QA)
    val backendDeveloper = Employee("Backend Developer", true, "1988-04-15", CharacterTypes.BACKEND_DEV)
    val gameDeveloper = Employee("Game Developer", true, "1992-07-13", CharacterTypes.GAME_DEV)
    val uiDesigner = Employee("UI Designer", true, "1991-10-02", CharacterTypes.UX_UI)

    //Создаем тим лидов
    val teamLead1 = Employee("Team Lead 1", true, "1985-08-22", CharacterTypes.TEAM_LEAD, listOf(qaEngineer, backendDeveloper))
    val teamLead2 = Employee("Team Lead 2", true, "1984-09-11", CharacterTypes.TEAM_LEAD, listOf(gameDeveloper, uiDesigner))

    //Создаем CTO со списком подчиненных
    return Employee("CTO", true, "1980-01-01", CharacterTypes.CTO, listOf(teamLead1, teamLead2))
}


fun main() {
    //Создаем иерархию сотрудников
    val cto = createEmployeeHierarchy()

    //Сериализуем с использованием Gson с pretty printing
    val gson = GsonBuilder().setPrettyPrinting().create()
    val json = gson.toJson(cto)

    //Записываем JSON в файл
    File("employee_hierarchy.json").writeText(json)

    //Читаем JSON из файла и десериализуем
    val jsonFromFile = File("employee_hierarchy.json").readText()
    val deserializedCto = gson.fromJson(jsonFromFile, Employee::class.java)

    //Печатаем десериализованный объект в консоль
    println(gson.toJson(deserializedCto, Employee::class.java))
}