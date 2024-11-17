package org.martikhora.kotlincourse.lesson22.homework

fun Char?.shiftChar(shiftValue: Int, alternateShift: Int, increase: Boolean) {
    if (this == null) {
        println("Символ равен null")
        return
    }

    //значение сдвига в зависимости от boolean
    val effectiveShift = if (increase) shiftValue else -alternateShift
    val newChar = this.toInt() + effectiveShift

    //новый символ
    println("Старый символ: '$this', Новый символ: '${newChar.toChar()}'")
}

//    val char: Char? = 'A'
//
//    //сдвиг
//    char.shiftChar(2, 1, true)   //увеличиваем 'A' на 2
//    char.shiftChar(2, 1, false)  // уменьшаем 'A' на 1
//
//    val nullChar: Char? = null //пример для null
//    nullChar.shiftChar(3, 1, true)