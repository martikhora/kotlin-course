package org.martikhora.kotlincourse.lesson13

class Homework {

    val list = listOf<Int>()
    val listStrings = listOf<String>()

    fun taskOne() {
        list.size > 5 //Проверить, что размер коллекции больше 5 элементов.
        list.isEmpty()//Проверить, что коллекция пустая
        list.isNotEmpty() //Проверить, что коллекция не пустая
        val number =
            list.getOrElse(1) { "Default value" }//Взять элемент по индексу или создать значение если индекса не существует
        val string = list.joinToString(separator = " | ") { "Number: $it" } //Собрать коллекцию в строку
        val sum = list.sum()//Посчитать сумму всех значений
        val av = list.average()//Посчитать среднее
        val max = list.max()//Взять максимальное число
        val min = list.min()//Взять минимальное число
        val first = list.firstOrNull()//Взять первое число или null
        val contains = list.contains(3) //Проверить что коллекция содержит элемент

    }

    fun taskTwo() {
        list.filter { it in 18..30 } //Отфильтровать коллекцию по диапазону 18-30
        list.filter { it % 2 != 0 && it % 3 != 0 } //Выбрать числа, которые не делятся на 2 и 3 одновременно
        listStrings.filterNotNull() //Очистить текстовую коллекцию от null элементов
        val mapOfWordLength = listStrings.map { it.length }//Преобразовать текстовую коллекцию в коллекцию длин слов
        val map =
            listStrings.associateWith { it.reversed() } //Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
        listStrings.sorted()// Отсортировать список в алфавитном порядке
        list.sortedDescending()// Отсортировать список по убыванию
        list.forEach { println("$it: ${it * it}") }//Распечатать квадраты элементов списка
        listStrings.groupBy { it.first() }// Группировать список по первой букве слов
        listStrings.distinct()// Очистить список от дублей
        list.take(3)// Взять первые 3 элемента списка
        list.takeLast(3)// Взять последние 3 элемента списка
    }


//    Написать метод, который принимает коллекцию чисел и возвращает строку с текущим состоянием коллекции используя конструкцию when


//    Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
//    Если максимальное число меньше -10 - “Отрицательная”
//    Если минимальное число больше 1000 - “Положительная”
//    Если содержит одновременно числа 3 и 14 - “Пи***тая”
//    Иначе - “Уникальная”
//
//    Вызвать метод с данными, подходящими под каждую из веток

    fun taskThree(list: List<Int>): String {

        return when {
            list.isEmpty() -> "Пусто"
            list.size < 5 -> "Короткая"
            list.first() == 0 -> "Стартовая"
            list.sum() > 10000 -> "Массивная"
            list.average() == 10.0 -> "Сбалансированная"
            list.joinToString("").length == 20 -> "Клейкая"
            list.maxOrNull() ?: Int.MIN_VALUE < -10 -> "Отрицательная"
            list.minOrNull() ?: Int.MAX_VALUE > 1000 -> "Положительная"
            list.contains(3) && list.contains(14) -> "Пи***тая"
            else -> "Уникальная"
        }
    }

    //Начальные значения: val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    //Цель: Отфильтровать удовлетворительные оценки (>=60), отсортировать оставшиеся по возрастанию и взять первые 3.
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    fun taskFour(grades: List<Int>) {
        val filteredGrades = grades.filter { it >= 60 }
        filteredGrades.sorted()
        filteredGrades.take(3)
    }


    //Цель: Привести все слова в списке к нижнему регистру, сгруппировать в каталог по первой букве.
    val listFurniture = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина",
        "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка",
        "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус",
        "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы", "подсвечник",
        "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    )

    fun categorizeByInitialLetter(items: List<String>) {
        val modifiedList = items.map { it.lowercase() }
        modifiedList.groupBy { it.first() }
    }


    //Цель: Перевести все слова в количество букв, подсчитать среднее значение.
    // Вывести форматированный текст с двумя знаками после запятой.

    fun averageLength(words: List<String>) {
        val length = words.map { it.length }
        val average = length.average()
        println("Средняя длина слов: ${"%.2f".format(average)}")
    }

    //Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности (“четные” и “нечетные”).
    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)

    fun uniqueNumbers(list: List<Int>) {
        val listUnique = list.distinct()
        listUnique.sortedDescending()
        listUnique.groupBy { if (it % 2 == 0) "четные" else "нечетные" }
    }

    //Цель: Найти первый возраст в списке, который соответствует условию (больше 18),
    // преобразовать его к строке, или вернуть сообщение "Подходящий возраст не найден".

    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    fun findAge(age: List<Int?>): String {
        val suitableAge = ages.firstOrNull { it != null && it > 18 }
        return suitableAge?.toString() ?: "Подходящий возраст не найден"
    }


    // Вызовы метода с данными, подходящими под каждую из веток
    fun main() {
        println(taskThree(emptyList())) // Пусто
        println(taskThree(listOf(1, 2, 3))) // Короткая
        println(taskThree(listOf(0, 1, 2, 3, 4))) // Стартовая
        println(taskThree(listOf(5000, 6000, 8000))) // Массивная
        println(taskThree(listOf(10, 10, 10, 10))) // Сбалансированная
        println(taskThree(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 1))) // Клейкая
        println(taskThree(listOf(-20, -15, -30))) // Отрицательная
        println(taskThree(listOf(1001, 1500, 2000))) // Положительная
        println(taskThree(listOf(3, 14, 5))) // Пи***тая
        println(taskThree(listOf(5, 6, 7, 8, 9))) // Уникальная

    }


}

