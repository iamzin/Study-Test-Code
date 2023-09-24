package com.example.demo.bowling

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class GameTest {

    lateinit var game: Game

    @BeforeEach
    fun setUp() {
        game = Game()
    }

    @Test
    fun `gutter game`() {
        val game = Game()
        game.roll(5)
        game.roll(5)
        game.roll(3)
        repeat(17) {
            game.roll(0)
        }
        assertEquals(13+3, game.score())
    }
}
