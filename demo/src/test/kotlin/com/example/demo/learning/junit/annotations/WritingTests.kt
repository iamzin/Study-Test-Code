package com.example.demo.learning.junit.annotations

import com.example.demo.learning.junit.annotations.Fast
import com.example.demo.learning.junit.annotations.FastTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class WritingTests {

    @Test
    fun addition() {
        assertEquals(2, 1 + 1)
    }

    @Fast
    @Test
    fun fast(){}

    @FastTest
    fun fastTest(){}
}