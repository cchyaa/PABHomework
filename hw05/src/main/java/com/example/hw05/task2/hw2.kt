package com.example.hw05.task2

fun applyTwice(n: Int, operation: (Int) -> Int): Int {
    return operation(operation(n))
}

fun printIf(items: List<String>, condition: (String) -> Boolean) {
    items.filter(condition).forEach { println(it) }
}

fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> {
    return list.map(mapper)
}

fun main() {
    // Lambda dari Task 1
    val double: (Int) -> Int = { it * 2 }
    val startsWithVowel: (String) -> Boolean = {
        it.isNotEmpty() && it.first().lowercaseChar() in "aeiou"
    }


    println(applyTwice(3, double))


    val courses = listOf("Algorithms", "Mobile Development", "Database", "Operating Systems", "Networks")
    printIf(courses, startsWithVowel)

    // transform
    val squares = transform(listOf(2, 3, 4)) { (it * it).toString() }
    println(squares)
}