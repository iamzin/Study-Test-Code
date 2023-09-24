package com.example.demo.bowling

class Game {

    var rollHistory = mutableListOf<Int>()

    fun roll(pins: Int) {
        rollHistory.add(pins)
    }

    fun score(): Int {
        return rollHistory.sum()
    }
}
