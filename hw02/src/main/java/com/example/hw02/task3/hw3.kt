package com.example.hw02.task3

fun main() {
    val numberOfDays = 5

    // Part A: semua hari
    for (day in 1..numberOfDays) {
        println("Day $day: Study for 20 minutes")
    }

    println() // baris kosong pemisah

    // Part B: hanya hari 1, 3, 5
    for (day in 1..numberOfDays step 2) {
        println("Day $day: Study for 20 minutes")
    }
}