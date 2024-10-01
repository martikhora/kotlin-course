package org.martikhora.kotlincourse.lesson7

import kotlin.math.sqrt

class Homework {

    //Напишите цикл for, который выводит числа от 1 до 5.
    fun from1to5() {
        for (i in 1..5) {
            println(i)
        }
    }

    //Напишите цикл for, который выводит четные числа от 1 до 10.
    fun from1to10() {
        for (i in 1..10) {
            if (i % 2 == 0) {
                println(i)
            }
        }
    }

    //Создайте цикл for, который выводит числа от 5 до 1.
    fun from5To1() {
        for (i in 5 downTo 1) {
            println(i)
        }
    }

    //Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    fun from10To1() {
        for (i in 10 downTo 1) {
            println(i - 2)
        }
    }

    //Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    fun from1To9() {
        for (i in 1..9 step 2) {
            println(i)
        }
    }

    //Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    fun from1To20() {
        for (i in 1..20 step 3) {
            println(i)
        }
    }

    //Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).
    fun from1To9WithUntil() {
        for (i in 1 until 9) {
            println(i)
        }
    }

    //Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.
    fun from3To15() {
        for (i in 3 until 15) {
            println(i)
        }
    }

    //Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    fun squaresFrom1To5() {
        var counter = 1
        while (counter in 1..5) {
            val squared = counter * counter
            println(squared)
            counter++
        }
    }

    //Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    fun from10to5() {
        var number = 10
        while (number in 10 downTo 5) {
            println(number--)
        }
    }


    //Используйте цикл do...while, чтобы вывести числа от 5 до 1.

    fun from5To1DoWhile() {
        var number = 5
        do {
            println(number)
            number--
        } while (number > 0)

    }

    //Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.

    fun from5To10() {
        var number = 5
        do {
            println(number)
            number++
        } while (number < 10)
    }

    //Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.

    fun from1ToTen() {
        for (i in 1..10) {
            println(i)
            if (i == 6) break
        }
    }

    //Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10

    fun infiniteFrom1To10 () {
        var number = 1
        while (true) {
            println(number)
            if (number == 10) break
        }
        number++
    }

    //В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.

    fun from1To10() {
        for (i in 1..10) {
            if (i % 2 == 0) continue
            println(i)
        }
    }

    //Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    fun from1To10Using3() {
        for (i in 1..10) {
            if (i % 3 == 0) continue
            println(i)
        }
    }


    //Создать цикл в цикле, в каждом использовать диапазон от 1 до 10.
    // В консоль вывести результат умножения переменных цикла.
    // Результат умножения выводить через print() и добавлять ещё один print(“ ”) с пробелом, чтобы отделять значения в строку.
    // После вложенного цикла выводить пустой println() чтобы следующий проход начинать с новой строки.
    // Результат должен быть как на картинке.

    fun multiplicationTable() {
        for (i in 1..10) {
            for (j in 1 ..10) {
                print(i * j)
                print(" ")
                if (j == 10) {
                    println()
                }
            }
        }
    }
}