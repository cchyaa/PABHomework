package com.example.hw03.task2

open class SmartDevice(val name: String) {
    var status = "off"

    open fun turnOn() {
        status = "on"
        println("$name is ON")
    }

    open fun turnOff() {
        status = "off"
        println("$name is OFF")
    }
}

class SmartTvDevice(name: String) : SmartDevice(name) {
    // Bonus: custom setter + private set
    var speakerVolume = 5
        private set(value) {
            field = when {
                value < 0 -> 0
                value > 100 -> 100
                else -> value
            }
        }

    var channelNumber = 1

    override fun turnOn() {
        super.turnOn()
        println("TV: display on")
    }

    fun increaseVolume() {
        speakerVolume = speakerVolume + 1
        println("Volume: $speakerVolume")
    }

    fun nextChannel() {
        channelNumber = channelNumber + 1
        println("Channel: $channelNumber")
    }
}

fun main() {
    val tv = SmartTvDevice("Living Room TV")
    tv.turnOn()
    tv.nextChannel()
    tv.increaseVolume()
    tv.turnOff()

    // tv.speakerVolume = 50   // tidak bisa dikompilasi karena private set
}