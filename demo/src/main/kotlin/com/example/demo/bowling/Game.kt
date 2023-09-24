package com.example.demo.bowling

class Game {

    val rollHistory = mutableListOf<Int>()

    fun roll(pins: Int) {
        rollHistory.add(pins)
    }

    fun score(): Int {
        if (rollHistory[0] + rollHistory[1] == 10 && rollHistory[2] + rollHistory[3] != 10) {
            return rollHistory.sum() + rollHistory[2]
        } else {
            return rollHistory.sum()
        }
    }
}
