package com.example.demo.learning.junit.annotations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import org.junit.platform.commons.util.StringUtils

class ParameterizedTests {

    @ParameterizedTest
    @ValueSource(strings = ["racecar", "radar", "able was I ere I saw elba"])
    fun palindromes(
            candidate: String
    ) {
        assertThat(StringUtils.isNotBlank(candidate))
    }
}