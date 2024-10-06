package org.martikhora.kotlincourse.lesson10

import java.util.StringJoiner

class Homework {

    //    Работа с массивами Array
//    Задание 1: Создание и Инициализация Массива
//    Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    fun createArray() {
        val array = arrayOf(1, 2, 3, 4, 5)
    }


    //    Задание 2: Создание Пустого Массива
//    Создайте пустой массив строк размером 10 элементов.
    fun createArrayEmpty() {
        val emptyArray: Array<String?> = arrayOfNulls(10)
        println(emptyArray)

    }


    //    Задание 3: Заполнение Массива в Цикле
//    Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    fun createArrayDouble() {
        val arrayDouble = DoubleArray(5)
        for (i in arrayDouble.indices) {
            arrayDouble[i] = (i * 2).toDouble()
        }
        for (value in arrayDouble) {
            println(value)
        }
    }


    //    Задание 4: Изменение Элементов Массива
//    Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение,
//    равное его индексу, умноженному на 3.
    fun changingArray() {
        val array = IntArray(5)
        for (i in array.indices) {
            array[i] = (i * 3)
        }
        for (value in array) {
            println(value)
        }
    }

    //    Задание 5: Работа с Nullable Элементами
//    Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    fun arrayWithNull() {
        val array: Array<String?> = arrayOf(null, "трум-пурум-пурум", "трам-парам-парам")
        for (value in array) {
            println(value)
        }
    }


    //    Задание 6: Копирование Массива
//    Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    fun arrayToCopy() {
        val array = arrayOf(1, 2, 3, 4, 5)
        val arrayCopy = IntArray(5)

        for (i in array.indices) {
            arrayCopy[i] = array[i]
        }

        for (value in arrayCopy) {
            println(value)
        }
    }


//    Задание 7: Разница Двух Массивов
//    Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.

    fun arrayDifference() {
        val arrayOne = arrayOf(1, 2, 3, 4, 5)
        val arrayTwo = arrayOf(5, 4, 3, 2, 1)
        val arrayThree = IntArray(5)

        for (i in arrayOne.indices) {
            arrayThree[i] = arrayTwo[i] - arrayOne[i]
        }
        for (value in arrayThree) {
            println(value)
        }
    }


//    Задание 8: Поиск Индекса Элемента
//    Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, возвращаем -1.
//    Реши задачу через цикл while.

    fun lookForIndex() {
        val array = arrayOf(1, 2, 3, 4, 5, 6, 7)

        if (array.size < 5) {
            println("-1")
        }
        while (array.size >= 5) {
            println(array[5])
            break
        }
    }


    //    Задание 9: Перебор Массива
//    Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
//    Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    fun iteration() {
        val array = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

        for (value in array) {
            if (value % 2 == 0) {
                println("$value четное")
            } else {
                println("$value нечетное")
            }
        }
    }

//    Задание 10: Поиск Значения в Массиве по вхождению
//    Создай функцию, которая принимает массив строк и строку для поиска.
//    Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()).
//    Верни найденный элемент из функции в виде строки.

    fun stringContains(strings: Array<String>, string: String) {
        for (value in strings) {
            if (value.contains(string)) {
                println(value)
            }
        }
    }


//    Работа со списками List
//    Задание 1: Создание Пустого Списка
//    Создайте пустой неизменяемый список целых чисел.

    fun emptyList() {
        val emptyList = listOf<Int>()
    }


//    Задание 2: Создание и Инициализация Списка
//    Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").

    fun listOfStrings() {
        val stringsArray = listOf("Hello", "World", "Kotlin")
    }


    //    Задание 3: Создание Изменяемого Списка
//    Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    fun listOfInts() {
        val listOfInts = mutableListOf<Int>()

        for (i in 0..4) listOfInts.add(i, i + 1)

        println(listOfInts)
    }


//    Задание 4: Добавление Элементов в Список
//    Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).

    fun listOfIntsExpanded(list: MutableList<Int>) {
        list.add(6)
        list.add(7)
        list.add(8)
    }


//    Задание 5: Удаление Элементов из Списка
//    Имея изменяемый список строк, удалите из него определенный элемент (например, "World").

    fun removeFromList(list: MutableList<String>) {
        list.remove("World")
    }


//    Задание 6: Перебор Списка в Цикле
//    Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.

    fun loop() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

        for (value in list) {
            println(value)
        }
    }


//    Задание 7: Получение Элементов Списка по Индексу
//    Создайте список строк и получите из него второй элемент, используя его индекс.

    fun getString() {
        val list = listOf<String>("Hello", "World", "Kotlin", "Java", "Scala")
        println(list[1])
    }


//    Задание 8: Перезапись Элементов Списка по Индексу
//    Имея изменяемый список чисел, измените значение элемента на определенной позиции
//    (например, замените элемент на позиции 2 на новое значение).

    fun changeElement() {
        val list = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
        list.removeAt(2)
        list.add(2, 99)
        println(list)

    }


    //    Задание 9: Объединение Двух Списков
//    Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков.
//    Реши задачу с помощью циклов.
    fun unite() {
        val list1 = listOf("Hello", "Java")
        val list2 = listOf("World", "Kotlin")
        val newList = mutableListOf<String>()
        for (value in list1) {
            newList.add(value)
        }
        for (value in list2) {
            newList.add(value)
        }
        println(newList)
    }


//    Задание 10: Нахождение Минимального/Максимального Элемента
//    Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.

    fun minAndMax() {
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        var min = list[0]
        var max = list[0]

        for (value in list) {
            if (value < min) {
                min = value
            }
            if (value > max) {
                max = value
            }
        }
    }


    //    Задание 11: Фильтрация Списка
//    Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    fun evensOnly(list: List<Int>) {

        val listOfEvens = mutableListOf<Int>()

        for (value in list) {
            if (value % 2 == 0) {
                listOfEvens.add(value)
            }
        }
        println(listOfEvens)

    }

    //    Работа с Множествами Set
//    Задание 1: Создание Пустого Множества
    //Создайте пустое неизменяемое множество целых чисел.
    fun emptySet() {
        val setOfNumbers = setOf<Int>()
    }

//    Задание 2: Создание и Инициализация Множества
//    Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).

    fun setOfInt() {
        val setOfNumbers = setOf<Int>(1, 2, 3)
    }

    //    Задание 3: Создание Изменяемого Множества
//    Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    fun setOfStrings() {
        val set = mutableSetOf<String>("Kotlin", "Java", "Scala")
    }

    //    Задание 4: Добавление Элементов в Множество
//    Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    fun mutableSet(set: MutableSet<String>) {
        set.add("Swift")
        set.add("Go")
        println(set)
    }

    //    Задание 5: Удаление Элементов из Множества
//    Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    fun removeFromSet(set: MutableSet<Int>, index: Int) {
        set.remove(index)
    }

    //    Задание 6: Перебор Множества в Цикле
//    Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    fun loopInSet() {
        val set = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        for (value in set) {
            println(value)
        }
    }

    //    Задание 7: Проверка Наличия Элемента в Множестве
//    Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
//    Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
    fun isPresentInSet(set: Set<String>, string: String): Boolean {
        for (value in set) {
            if (value == string) {
                return true
            }
        }
        return false
    }

//    Задание 8: Объединение Двух Множеств
//    Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств.
//    Реши задачу с помощью циклов.

    fun uniteSets(set1: Set<String>, set2: Set<String>) {
        val newSet = mutableSetOf<String>()

        for (value in set1) {
            newSet.add(value)
        }
        for (value in set2) {
            newSet.add(value)
        }

        println(newSet)
    }

    //    Задание 9: Нахождение Пересечения Множеств
//    Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.
    fun findSame(set1: Set<Int>, set2: Set<Int>) {
        val set = mutableSetOf<Int>()
        for (value1 in set1) {
            for (value2 in set2) {
                if (value1 == value2)
                    set.add(value1)
            }
        }
        println(set)
    }


//    Задание 10: Нахождение Разности Множеств
//    Создайте два множества строк и найдите разность первого множества относительно второго
//    (элементы, присутствующие в первом множестве, но отсутствующие во втором).
//    Реши задачу через вложенные циклы и переменные флаги.

    fun difference(set1: Set<String>, set2: Set<String>) {
        val set1: Set<String> = setOf("apple", "banana", "cherry", "date")
        val set2: Set<String> = setOf("banana", "date", "fig", "grape")

        val difference = mutableSetOf<String>()

        for (value1 in set1) {
            var found = false
            for (value2 in set2) {
                if (value1 == value2) {
                    found = true
                    break
                }
            }
            if (!found) {
                difference.add(value1)
            }
        }
        println(difference)
    }


    //    Задание 11: Конвертация Множества в Список
//    Создайте множество строк и конвертируйте его в список с использованием цикла.
    fun setToList(set: Set<String>) {
        val list = mutableListOf<String>()
        for (value in set) {
            list.add(value)
        }
        println(list)
    }
}