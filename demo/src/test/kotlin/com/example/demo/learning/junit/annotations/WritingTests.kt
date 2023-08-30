package com.example.demo.learning.junit.annotations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WritingTests {

    @Test
    fun addition() {
        assertThat(1 + 1).isEqualTo(2)

    }

    @Fast
    @Test
    fun fast(){}

    @FastTest
    fun fastTest(){}
}