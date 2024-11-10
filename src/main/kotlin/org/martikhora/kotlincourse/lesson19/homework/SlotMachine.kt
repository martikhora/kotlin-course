package org.martikhora.kotlincourse.lesson19.homework

class SlotMachine(
    val color: String,
    val model: String,
    private var isOn: Boolean = false,
    private var isOSLoaded: Boolean = false,
    private val availableGames: MutableList<String> = mutableListOf(),
    private var hasJoystick: Boolean = true,
    private var earningsBalance: Double = 0.0,
    private val owner: String,
    private val supportPhone: String,
) {

    // Метод для включения игрового автомата
    fun turnOn() {
        isOn = true
        println("$model включен")
    }

    // Метод для выключения игрового автомата
    fun turnOff() {
        isOn = false
        println("$model выключен")
    }

    // Метод для загрузки ОС
    fun loadOS() {
        if (!isOSLoaded) {
            isOSLoaded = true
            println("ОС загружена на $model")
        }
    }

    // Метод для завершения работы ОC
    fun shutdownOS() {
        if (isOSLoaded) {
            isOSLoaded = false
            println("ОС завершена на $model")
        }
    }

    // Метод для показа списка игр
    fun showAvailableGames() {
        println("Доступные игры на $model: ${availableGames.joinToString()}")
    }

    // Метод для включения выбранной игры
    fun startGame(game: String) {
        if (isOn && isOSLoaded && availableGames.contains(game)) {
            println("Игра $game запущена на $model")
        } else {
            println("Невозможно запустить игру $game на $model")
        }
    }

    // Метод для оплаты игрового сеанса
    fun payForSession(amount: Double) {
        if (amount > 0) {
            earningsBalance += amount
            println("Оплачено $amount на $model")
        }
    }

    // Метод для открытия сейфа и выдачи наличных
    fun openSafe() {
        println("Сейф открыт. Наличные: $earningsBalance")
    }

    // Метод для выплаты выигрыша
    fun payoutWin(amount: Double) {
        if (amount != earningsBalance) {
            earningsBalance -= amount
            println("Выплачено $amount на $model")
        } else {
            println("Недостаточно средств для выплаты выигрыша на $model")
        }
    }
}