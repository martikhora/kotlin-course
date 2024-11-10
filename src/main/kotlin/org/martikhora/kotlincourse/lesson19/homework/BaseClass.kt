package org.martikhora.kotlincourse.lesson19.homework

abstract class BaseClass(
    // объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    // privateVal не доступен в main(), но его значение доступно через инициализацию конструктора в ChildrenClass.
    // Класс-наследник может использовать это значение, но непосредственно в родительском классе доступа к нему нет.
    private val privateVal: String,
    // объясни, почему это поле недоступно в main()
    // protected ограничивает доступ только до самого класса и его наследников,
    // но не до внешнего кода, включая функцию main().
    protected val protectedVal: String, val publicVal: String
) {
    var publicField =
        "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" + "Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }

    //val child = ChildrenClass("Private Value", "Protected Value", "Public Value")
    //child.changePublicField("Антонио Бандерас")

    protected var protectedField = "измени меня из функции main() через сеттер в наследнике"
        set(value) {
            field = value
        }
    private var privateField = "добавь сеттер чтобы изменить меня из main()"
        set(value) {
            field = value
        }

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
        ).map { "${it.key}: ${it.value}" }.joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // объясни, почему эта функция не может быть публичной
    // чтобы ограничить доступ из других классов и функция могла вызываться только из самого класса или его подклассов
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // объясни, почему эта функция не может быть публичной или protected
    // чтобы ограничить доступ и обеспечить принцип работы инкапсуляции
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass

    private class PrivateClass
}

class ChildrenClass(
    privateVal: String, protectedVal: String,
    // объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // publicVal передается в качестве аргумента конструктора
    // и доступен как открытое поле класса BaseClass, поэтому его можно читать в main()
    publicVal: String
) : BaseClass(privateVal, protectedVal, privateVal) {

    // объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // getAll() определена в классе BaseClass, и так как ChildrenClass наследует от BaseClass,
    // эта функция становится доступной через экземпляр ChildrenClass.

    // проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    // printText() вызовет privatePrint() из BaseClass, и поэтому вывод будет "Печать из класса BaseClass".
    // Метод privatePrint() в классе ChildrenClass не переопределяет метод родительского класса, потому что
    // приватные методы не могут быть переопределены. Так они доступны только в пределах своего класса.

    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    fun changePublicField(newValue: String) {
        publicField = newValue
    }




}

