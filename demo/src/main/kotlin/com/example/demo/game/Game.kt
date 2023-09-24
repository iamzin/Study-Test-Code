package com.example.demo.game

class Game {

    var rolls: IntArray = IntArray(21)
    var currentRoll: Int = 0

    fun roll(pins: Int) {
        rolls[currentRoll++] = pins
    }

    // 추상화 레벨이 동일하도록 리팩토링: isStrike, strikeBonus
    fun score(): Int {
        var score = 0
        var frameIndex = 0
        for (frame in 0 until 10) {
            if (isStrike(frameIndex)) {
                score += strikeBonus(frameIndex)
                frameIndex += 1
            } else if (isSpare(frameIndex)) {
                score += spareBonus(frameIndex)
                frameIndex += 2
            } else {
                score += sumOfPinsInFrame(frameIndex)
                frameIndex += 2
            }
        }
        return score
    }

    private fun spareBonus(frameIndex: Int) = 10 + rolls[frameIndex + 2]

    private fun strikeBonus(frameIndex: Int) = 10 + rolls[frameIndex + 1] + rolls[frameIndex + 2]

    private fun isStrike(frameIndex: Int) = rolls[frameIndex] == 10

    private fun isSpare(frameIndex: Int) = rolls[frameIndex] + rolls[frameIndex + 1] == 10

    private fun sumOfPinsInFrame(frameIndex: Int) = rolls[frameIndex] + rolls[frameIndex + 1]
}
