fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

val name: String = "Alice"
var age: Int = 30
const val PI = 3.14

lateinit var userInfo: String
val lazyValue: String by lazy {
    "Hello, this is a lazy String!"
}

var speed: Double? = null

var count: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field = value
    }

//forCar

val chassis: String = "abcd1234"
var colour: String = "red"
var distance: Double = 0.0
lateinit var owner: String
const val WHEELS: Int = 4
val report: String by lazy {
    ""
}

var fuel: Double = 0.0
    get() = field
    set(value) {
        if (value > 0 ) {
            field + value
        }
    }