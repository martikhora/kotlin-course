package org.martikhora.kotlincourse.lesson8

class Homework {

    fun makeFunny(sentence: String) {
        val sentence = sentence
        lateinit var replacedString: String

        if (sentence.contains("невозможно")) {
            replacedString = sentence.replace("невозможно", "совершенно точно возможно, просто требует времени")
            println(replacedString)
        }
        if (sentence.startsWith("Я не уверен")) {
            val suffix = ", но моя интуиция говорит об обратном."
            replacedString = sentence + suffix
            println(replacedString)
        }
        if (sentence.contains("катастрофа")) { //тут надо поправить женский род на средний ???
            replacedString = sentence.replace("невозможно", "интересное событие")
            println(replacedString)
        }
        if (sentence.endsWith("без проблем")) {
            replacedString = sentence.replace("без проблем","с парой интересных вызовов на пути")
            println(replacedString)
        }
        if (!(sentence.contains(" "))) {
            val startsWith = "Иногда, "
            val endsWith = ", но не всегда"
            replacedString = startsWith + sentence.lowercase() + endsWith
            println(replacedString)
        }
    }

    //Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
    //Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
    // Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.

    fun getLogs(logs: String) {
        val dateTime = logs.substringAfter("-> ")
        val date = dateTime.substringBefore(" ")
        val time = dateTime.substringAfter(" ")

        println(date)
        println(time)
    }



    //Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467".
    // Замаскируйте все цифры, кроме последних четырех, символами "*".
    fun maskCreditCard(creditCard: String){
        val creditCardDigitsToMask = creditCard.substring(15)
        val creditCardMasked = "**** **** **** $creditCardDigitsToMask"

        println(creditCardMasked)

    }

    //Задание 3: Форматирование Адреса Электронной Почты. Используй replace
    //Описание: У вас есть электронный адрес "username@example.com".
    // Преобразуйте его в строку "username [at] example [dot] com".
    fun emailFormat(email: String) {
        val emailWithAt = email.replace("@", " [at] ")
        val emailWithDot = emailWithAt.replace(".", " [dot] ")
        println(emailWithDot)
    }

    //Задание 4: Извлечение Имени Файла из Пути
    //Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.
    fun filePath(filePath: String) {
        val filePath = filePath.substringAfterLast("/")
        println(filePath)
    }

    //Задание 5: Создание Аббревиатуры из Фразы. Используй split с набором символов для разделения.
    // Используй for для перебора слов. Используй var переменную для накопления первых букв.
    fun abbreviate(abbreviation: String) {
        val words = abbreviation.split(" ", "-")
        var abbreviation = ""
        for (word in words) {
            abbreviation += word[0].uppercase()
        }
        println(abbreviation)
    }

}