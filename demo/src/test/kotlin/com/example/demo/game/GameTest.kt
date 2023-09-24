package com.example.demo.game

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * 1. gutter game: all 0s - score 0 DONE!
 * 2. all 1s - score 20 DONE!
 * 3. frame 1 spare (3, 7, 5) - score 20 DONE!
 * 4. frame 1 strike (10, 7, 2) - score 28 DONE!
 * 5. perfect strike 12 - score 300 DONE!
 */
class GameTest {

    lateinit var game: Game

    @BeforeEach
    fun setUp() {
        game = Game()
    }

    private fun rollMany(times: Int, pins: Int) {
        repeat(times) {
            game.roll(pins)
        }
    }

    @Test
    fun `gutter game`() {
        rollMany(20,0)
        assertThat(game.score()).isEqualTo(0)
    }


    @Test
    fun `all 1s`() {
        rollMany(20,1)
        assertThat(game.score()).isEqualTo(20)
    }

    private fun spare() {
        game.roll(3)
        game.roll(7)
    }

    @Test
    fun `frame 1 spare`() {
        spare()
        game.roll(5)
        rollMany(17, 0)
        assertThat(game.score()).isEqualTo(10 + 5 + 5)
    }

    private fun strike() {
        game.roll(10)
    }

    @Test
    fun `frame 1 strike`() {
        strike()
        game.roll(7)
        game.roll(2)
        rollMany(16, 0)
        assertThat(game.score()).isEqualTo(10 + 9 + 9)
    }

    @Test
    fun `perfect`() {
        rollMany(12, 10)
        assertThat(game.score()).isEqualTo(300)
    }
}
