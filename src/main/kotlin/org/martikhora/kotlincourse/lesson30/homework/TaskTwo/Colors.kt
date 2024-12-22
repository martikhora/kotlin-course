package org.martikhora.kotlincourse.lesson30.homework.TaskTwo

enum class Colors(val value: String) {
    RED_COLOR("\u001B[31m"),
    YELLOW_COLOR("\u001B[33m"),
    GREEN_COLOR("\u001B[32m"),
    RESET_COLOR("\u001B[0m")
}

const val LIGHT_SYMBOL = "\u25CF"

enum class TrafficLightSignal(val color: Colors, val duration: Long, val blinkTimes: Int?) {
    RED(Colors.RED_COLOR, 4000, null),
    YELLOW(Colors.YELLOW_COLOR, 2000, null),
    GREEN(Colors.GREEN_COLOR, 4000, 4) // Зелёный сигнал мигает 4 раза
}

// отображение сигнала
fun showSignal(signal: TrafficLightSignal) {
    print("\r" + signal.color.value + LIGHT_SYMBOL + Colors.RESET_COLOR.value) // Выводим сигнал с возвратом каретки
}

fun clear() {
    print("\r    ")
}

fun trafficLight() {
    while (true) {
        // Красный сигнал
        showSignal(TrafficLightSignal.RED)
        Thread.sleep(TrafficLightSignal.RED.duration)

        // Жёлтый сигнал
        showSignal(TrafficLightSignal.YELLOW)
        Thread.sleep(TrafficLightSignal.YELLOW.duration)

        // Зелёный сигнал
        showSignal(TrafficLightSignal.GREEN)
        Thread.sleep(TrafficLightSignal.GREEN.duration)

        // Мигание зелёного сигнала
        if (TrafficLightSignal.GREEN.blinkTimes != null) {
            repeat(TrafficLightSignal.GREEN.blinkTimes) {
                showSignal(TrafficLightSignal.GREEN)
                Thread.sleep(300)
                clear()
                Thread.sleep(300)
            }
        }
    }
}

fun main() {
    trafficLight()
}