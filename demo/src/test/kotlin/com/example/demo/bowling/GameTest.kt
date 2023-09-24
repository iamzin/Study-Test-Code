package com.example.demo.bowling

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GameTest {

    @Test
    fun `gutter game 0`() {
        val game = Game()
        repeat(20) {
            game.roll(0)
        }
        assertEquals(0, game.score())
    }

    @Test
    fun `gutter game 1`() {
        val game = Game()
        repeat(20) {
            game.roll(1)
        }
        assertEquals(20, game.score())
    }
}
