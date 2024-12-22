package org.martikhora.kotlincourse.lesson30.homework.taskThree

enum class CoffeeType(val cost: Double, val coffeeBase: String, val recommendedSugar: Int, val hasMilk: Boolean = false) {
    ESPRESSO(2.50, "Espresso", 0),
    LATTE(3.00, "Latte", 2, true),
    CAPPUCCINO(2.75, "Cappuccino", 1, true),
    AMERICANO(2.25, "Americano", 0),
    NESCAFE_CLASSIC(1.50, "Nescafe Classic", 1);

    fun description() = "The $coffeeBase ${if (hasMilk) "with" else "without"} milk costs \$$cost and is best with $recommendedSugar spoons of sugar."
}

enum class CharacterTypes {
    CTO,
    UX_UI,
    CRM, // Customer Relationship Manager
    GAME_DEV,
    TEAM_LEAD,
    BACKEND_DEV,
    PM,
    SYSADMIN,
    QA
}

fun suggestCoffee(characterType: CharacterTypes): CoffeeType {
    return when (characterType) {
        CharacterTypes.CTO, CharacterTypes.TEAM_LEAD -> CoffeeType.ESPRESSO
        CharacterTypes.UX_UI, CharacterTypes.GAME_DEV -> CoffeeType.LATTE
        CharacterTypes.PM, CharacterTypes.CRM -> CoffeeType.CAPPUCCINO
        CharacterTypes.BACKEND_DEV, CharacterTypes.SYSADMIN -> CoffeeType.AMERICANO
        CharacterTypes.QA -> CoffeeType.NESCAFE_CLASSIC
    }
}

fun main() {
    val characterType = CharacterTypes.QA
    val coffeeSuggestion = suggestCoffee(characterType)
    println(coffeeSuggestion.description())
}
