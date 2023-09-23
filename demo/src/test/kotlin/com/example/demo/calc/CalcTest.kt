package com.example.demo.calc

import com.example.demo.calc.Calc
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource

class CalcTest {

    lateinit var calc: Calc

    @BeforeEach
    fun setUp() {
        calc = Calc()
    }

    @ParameterizedTest
    @CsvSource("0, 0, 0", "1, 2, 3", "10, 20, 30")
    fun add(a: Int, b: Int, result: Int) {
        assertThat(calc.add(a, b)).isEqualTo(result)
    }

}
