package com.example.kotlin_dice

class Dice(private val customDiceSide: Int) {

    fun roll(): Int {
        return  (1..customDiceSide).random()
    }
}