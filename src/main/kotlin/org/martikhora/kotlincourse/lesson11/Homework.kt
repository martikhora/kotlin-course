package org.martikhora.kotlincourse.lesson11

import java.util.Date
import java.util.StringJoiner

class Homework {

    //    Задание 1: Создание Пустого Словаря
//    Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val emptyMap = mapOf<Int, Int>()

    //    Задание 2: Создание и Инициализация Словаря
//    Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val map = mapOf<Float, Double>(
        1.0f to 1.1, 2.2f to 3.6, 5.6f to 8.9
    )

    //    Задание 3: Создание Изменяемого Словаря
//    Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val mutableMap = mutableMapOf<Int, String>()

    //    Задание 4: Добавление Элементов в Словарь
//    Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    fun addToMutableMap(map: MutableMap<Int, String>) {
        map[1] = "Hello"
        map[2] = "World"
        map[3] = "Kotlin"
    }

    //    Задание 5: Получение Значений из Словаря
//    Используя словарь из предыдущего задания, извлеките значение, используя ключ.
//    Попробуй получить значение с ключом, которого в словаре нет.
    fun getFromMap(map: MutableMap<Int, String>) {
        println(map[1]) //World
        println(map[6]) // null
    }

    //    Задание 6: Удаление Элементов из Словаря
//    Удалите определенный элемент из изменяемого словаря по его ключу.
    fun removeFromMap(map: MutableMap<Int, String>) {
        map.remove(1)
    }

    //    Задание 7: Перебор Словаря в Цикле
//    Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
//    Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”
    fun loopForMap(map: MutableMap<Double, Int>) {
        for ((key, value) in map) {
            if (value == 0) {
                println("Бесконечность")
            } else {
                val div = key / value
                println(div)
            }
        }
    }

    //Задание 8: Перезапись Элементов Словаря
//    Измените значение для существующего ключа в изменяемом словаре.

    fun changeValue(map: MutableMap<String, String>) {
        map["Германия"] = "Берлин"
    }


    //    Задание 9: Сложение Двух Словарей
//    Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    fun twoMapsInOne(map1: Map<Int, String>, map2: Map<Int, String>) {

        val map1 = mapOf(1 to "Hello", 2 to "World")
        val map2 = mapOf(3 to "Java", 4 to "Kotlin")

        val mapUnite = mutableMapOf<Int, String>()

        for ((key, value) in map1) {
            mapUnite[key] = value
        }

        for ((key, value) in map2) {
            mapUnite[key] = value
        }


        //    Задание 10: Словарь с Сложными Типами
//    Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
        fun difficultMap(map: MutableMap<String, List<Int>>) {
            map["Hello"] = listOf(1, 2, 3)
            map["World"] = listOf(4, 5, 6)
        }


//    Задание 11: Использование Множества в Качестве Значения
//    Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь.
//    Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.

        fun mapWithSet() {

            val map = mutableMapOf<Int, MutableSet<String>>(
                0 to mutableSetOf("Hello", "World"),
                1 to mutableSetOf("Java", "Scala")
            )

            map[0]?.add("Kotlin")

            println(map)

        }


        //    Задание 12: Поиск Элемента по Значению
//    Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5
//    в качестве первого или второго значения.
        fun findValue() {
            val mapWithPairs = mapOf(
                Pair(1, 2) to 1,
                Pair(3, 4) to 2,
                Pair(5, 6) to 3,
                Pair(7, 8) to 4,
                Pair(9, 10) to 5
            )

            for ((key) in mapWithPairs) {
                if (key.first == 5) {
                    println(key.first)
                }
                if (key.second == 5) {
                    println(key.second)
                }
            }
        }

//    Напиши решения задач. В каждом случае нужно проанализировать и подобрать оптимальный тип словаря.
//    Задание 6: Словарь Библиотека
//    Ключи - автор книги, значения - список книг

        val library = mutableMapOf<String, List<String>>(
            "Чехов" to listOf("Вишневый сад", "Чайка"),
            "Пушкин" to listOf("Евгений Онегин", "Сказка о царе Салтане")
        )

//    Задание 12: Справочник Растений
//    Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений

        val plants = mutableMapOf<String, List<String>>(
            "Деревья" to listOf("Дуб", "Ясень", "Береза"),
            "Цветы" to listOf("Астра", "Роза", "Лилия")
        )
//    Задание 8: Четвертьфинала
//    Ключи - названия спортивных команд, значения - списки игроков каждой команды

        val quarterFinal = mutableMapOf<String, List<String>>(
            "Спартак" to listOf("Иванов", "Петров", "Сидоров"),
            "Динамо" to listOf("Сидоров", "Петров", "Иванов")
        )

//    Задание 9: Курс лечения
//    Ключи - даты, значения - список препаратов принимаемых в дату

        val medicine = mutableMapOf<String, List<String>>(
            "01-10-2024" to listOf("Парацетамол", "Анальгин"),
            "02-10-2024" to listOf("Цитрамон", "Грандаксин")
        )


//    Задание 10: Словарь Путешественника
//    Ключи - страны, значения - словари из городов со списком интересных мест.

        val travelling = mutableMapOf<String, MutableMap<String, List<String>>>(
            "Италия" to mutableMapOf(
                "Рим" to listOf("Колизей", "Площадь святого Петра"),
                "Венеция" to listOf("Карнавал", "Каналы")
            ),
            "Франция" to mutableMapOf(
                "Париж" to listOf("Фейфелева башня", "Какакомбы"),
                "Прованс" to listOf("Майонез Провансаль", "Винный погреб Франсуа с дегустацией сивухи")
            )
        )
    }
}