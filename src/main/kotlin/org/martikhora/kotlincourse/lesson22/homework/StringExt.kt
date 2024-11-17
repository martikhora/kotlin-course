package org.martikhora.kotlincourse.lesson22.homework

fun String.encrypt(base: Int): String {
    return this.map { char ->
        (char.toInt() + base).toChar() // Сдвигаем каждый символ вперед по таблице Unicode
    }.joinToString("") // Объединяем результат в строку
}

fun String.decrypt(base: Int): String {
    return this.map { char ->
        (char.toInt() - base).toChar() // Сдвигаем каждый символ назад по таблице Unicode
    }.joinToString("") // Объединяем результат в строку
}

//val originalString = "Hello, World!"
//val shiftValue = 3
//
//val encryptedString = originalString.encrypt(shiftValue)
//println("Зашифрованная строка: $encryptedString")
//
//val decryptedString = encryptedString.decrypt(shiftValue)
//println("Расшифрованная строка: $decryptedString")
//
////проверка что строка вернулась к нормальному состоянию
//if (originalString == decryptedString) {
//    println("Тест пройден: Строка успешно расшифрована.")
//} else {
//    println("Тест не пройден: Строка не совпадает с исходной.")
//}


fun String.printPidmarkoz(userNames: List<String>) {
    // строка, которую мы будем выводить
    val nameToPrint = "гитлер"

    for ((index, userName) in userNames.withIndex()) {
        // Печатаем имя автора
        println("--------------")
        println(userName)
        // Проверяем, если индекс меньше длины nameToPrint
        if (index < nameToPrint.length) {
            // Печатаем букву строки "пидмаркоз" под именем
            println(" ${nameToPrint[index]}")
        }
        println("--------------")
        println() // Печатаем пустую строку для разделения
    }
}

//val userNames = listOf("Маша", "Глаша", "Саша", "Вася", "Лада", "Пидмаркоз")
//
//// Вызов метода расширения для печати букв в столбик
//"Имя автора".printPidmarkoz(userNames)
