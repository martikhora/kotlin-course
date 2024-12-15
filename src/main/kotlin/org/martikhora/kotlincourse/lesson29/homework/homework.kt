package org.martikhora.kotlincourse.lesson29.homework

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun main() {

    //Создай текущую временную метку и выведи её на печать (чтобы ещё раз запомнить название этого класса)
    val currentTimestamp = LocalDateTime.now()
    println("Текущая временная метка: $currentTimestamp")

    //Создай дату своего дня рождения.
    val birthday = LocalDate.of(1994, 4, 9)
    println(birthday)

    //Создай период между датой своего рождения и текущей датой. Выведи на печать количество лет из этого периода.
    val currentDate = LocalDate.now()
    val period = Period.between(birthday, currentDate)
    println("${period.years}")

    //Создай два объекта даты: 25 февраля 2023 года и 25 февраля 2024 года. Создай форматтер, который форматирует дату в месяц и день.
    //Выведи первую отформатированную дату, прибавив к ней 10 дней.
    //Выведи вторую отформатированную дату, прибавив к ней 10 дней.
    val date1 = LocalDate.of(2023, 2, 25)
    val date2 = LocalDate.of(2024, 2, 25)

    val formatter = DateTimeFormatter.ofPattern("MMMM d")
    val formattedDate1 = date1.plusDays(10).format(formatter)
    println(formattedDate1)

    val formattedDate2 = date2.plusDays(10).format(formatter)
    println(formattedDate2)

}

