package com.example.demo.learning.junit.annotations

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("A special test case")
class DisplayNames {

    @Test
    @DisplayName("Custom test name containing spaces")
    fun testWithDisplayNameContainingSpaces() {
    }

    @Test
    @DisplayName("╯°□°）╯")
    fun testWithDisplayNameContainingSpecialCharacters() {
    }

    @Test
    @DisplayName("🥰")
    fun testWithDisplayNameContainingEmoji() {

    }
}