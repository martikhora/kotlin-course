package org.martikhora.kotlincourse.lesson29.homework

import java.time.LocalDate

private val startBoomers = LocalDate.of(1946, 1, 1)
private val endBoomers = LocalDate.of(1964, 12, 31)
private val startZoomers = LocalDate.of(1997, 1, 1)
private val endZoomers = LocalDate.of(2012, 12, 31)

fun identifyGeneration(date: LocalDate): String {
    return when {
        (date.isAfter(startBoomers.minusDays(1)) && date.isBefore(endBoomers.plusDays(1))) -> "Бумер"
        (date.isAfter(startZoomers.minusDays(1)) && date.isBefore(endZoomers.plusDays(1))) -> "Зумер"
        else -> "Не определено"
    }.also { println(it) }
}