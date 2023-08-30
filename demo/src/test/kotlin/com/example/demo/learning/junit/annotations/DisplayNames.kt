package com.example.demo.learning.junit.annotations

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("A special test case")
class DisplayNames {

    @Test
    fun `Custom test name containing spaces`() {
    }

    @Test
    fun `╯°□°）╯`() {
    }

    @Test
    fun `🥰`() {

    }
}