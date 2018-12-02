package main.kotlin

import java.io.File

fun main(args: Array<String>) {
    println(findFirstRepeatedFrequency(File("resources/day01.txt").readLines().map(String::toInt)))
}

fun findFirstRepeatedFrequency(frequencyChanges: List<Int>): Int {
    var currentFrequency = 0
    val frequencySet = mutableSetOf(currentFrequency)
    while (true) {
        frequencyChanges.forEach {
            currentFrequency += it
            if (frequencySet.contains(currentFrequency)) {
                return currentFrequency
            }
            frequencySet.add(currentFrequency)
        }
    }
}
