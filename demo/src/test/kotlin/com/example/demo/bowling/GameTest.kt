package com.example.demo.bowling

import com.example.demo.calc.Calc
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class GameTest {

    lateinit var game: Game

    @BeforeEach
    fun setUp() {
        game = Game()
    }

    @Test
    fun `모든 frame에서 0개의 pin 쓰러트리기`() {
        val game = Game()
        repeat(20) {
            game.roll(0)
        }
        assertEquals(0, game.score())
    }

    @Test
    fun `모든 frame에서 1개의 pin 쓰러트리기`() {
        val game = Game()
        repeat(20) {
            game.roll(1)
        }
        assertEquals(20, game.score())
    }

    @Test
    fun `frame 1에서 스페어`() {
        val game = Game()
        game.roll(5)
        game.roll(5)
        game.roll(3)
        repeat(17) {
            game.roll(0)
        }
        assertEquals(13+3+0, game.score())
    }
}
