package org.martikhora.kotlincourse.lesson30.homework.taskOne

enum class TestStatus {
    PASS,
    BROKEN,
    FAILURE
}


fun runTest(test: () -> Unit): TestStatus {
    return try {
        test()
        TestStatus.PASS
    } catch (e: AssertionError) {
        TestStatus.FAILURE
    } catch (e: Exception) {
        TestStatus.BROKEN
    }
}

fun main() {
    val status1 = runTest {
        // Пример теста, который проходит
        assert(1 + 1 == 2)
    }
    println("Test 1 status: $status1") //PASS

    val status2 = runTest {
        // Пример теста, который вызывает AssertionError
        assert(1 + 1 == 3)
    }
    println("Test 2 status: $status2") //FAILURE

    val status3 = runTest {
        // Пример теста, который вызывает другое исключение
        throw RuntimeException("Some error")
    }
    println("Test 3 status: $status3") // BROKEN

}