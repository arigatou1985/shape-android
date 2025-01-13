package com.example.shapeandroid

import org.junit.Assert.*
import org.junit.Test

class MyCalculatorTest {
    @Test
    fun addition_isCorrect() {
        val calculator = MyCalculator()
        assertEquals(5, calculator.add(2, 3))
    }

    @Test
    fun subtraction_isCorrect() {
        val calculator = MyCalculator()
        assertEquals(1, calculator.subtract(3, 2))
    }

    @Test
    fun multiplication_isCorrect() {
        val calculator = MyCalculator()
        assertEquals(6, calculator.multiply(2, 3))
    }

    @Test
    fun division_isCorrect() {
        val calculator = MyCalculator()
        assertEquals(2, calculator.divide(6, 3))
    }

    @Test(expected = ArithmeticException::class)
    fun division_byZero_throwsException() {
        val calculator = MyCalculator()
        calculator.divide(6, 0)
    }
}