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
}