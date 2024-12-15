package org.martikhora.kotlincourse.lesson29.homework

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun dateFormatting(temporal: Temporal): String {
    return when (temporal) {
        is LocalDateTime -> "${temporal.hour} часов, ${temporal.minute} минут, ${temporal.second} секунд"
        is ZonedDateTime -> "${temporal.hour} часов, ${temporal.minute} минут, ${temporal.second} секунд, часовой пояс: ${temporal.zone}"
        is OffsetDateTime -> "${temporal.hour} часов, ${temporal.minute} минут, ${temporal.second} секунд, смещение: ${temporal.offset}"
        is LocalDate -> "Дата: $temporal"
        is LocalTime -> "${temporal.hour} часов, ${temporal.minute} минут, ${temporal.second} секунд" // Без даты
        else -> "Неподдерживаемый тип"
    }
}

fun dateFormattingISO(temporal: Temporal): String {
    return when (temporal) {
        is LocalDateTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
        is OffsetDateTime -> temporal.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        is LocalDate -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE)
        is LocalTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_TIME)
        else -> "Неподдерживаемый тип"
    }
}

fun main() {

    val localDateTime = LocalDateTime.now()
    val zonedDateTime = ZonedDateTime.now()
    val offsetDateTime = OffsetDateTime.now()
    val localDate = LocalDate.now()
    val localTime = LocalTime.now()
    val birthday = LocalDate.of(1994, 4, 9)
    val zonedBirthday = ZonedDateTime.of(1994, 4, 9, 22, 30, 0, 0, ZoneId.of("Europe/Moscow"))
    val offsetBirthday = OffsetDateTime.of(1994, 4, 9, 22, 30, 0, 0, ZoneOffset.ofHours(3))

//    println(dateFormatting(localDateTime))
//    println(dateFormatting(zonedDateTime))
//    println(dateFormatting(offsetDateTime))
//    println(dateFormatting(localDate))
//    println(dateFormatting(localTime))
    println(dateFormatting(birthday))
    println(dateFormatting(zonedBirthday))
    println(dateFormatting(offsetBirthday))

//    println(dateFormattingISO(localDateTime))
//    println(dateFormattingISO(zonedDateTime))
//    println(dateFormattingISO(offsetDateTime))
//    println(dateFormattingISO(localDate))
    println(dateFormattingISO(birthday))
    println(dateFormattingISO(zonedBirthday))
    println(dateFormattingISO(offsetBirthday))


}