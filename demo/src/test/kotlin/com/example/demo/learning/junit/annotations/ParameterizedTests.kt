package com.example.demo.learning.junit.annotations

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import org.junit.platform.commons.util.StringUtils

class ParameterizedTests {

    @ParameterizedTest
    @ValueSource(strings = ["racecar", "radar", "able was I ere I saw elba"])
    fun palindromes(
            candidate: String
    ) {
        assertTrue(StringUtils.isNotBlank(candidate))
    }
}