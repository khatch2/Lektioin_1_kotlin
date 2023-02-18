package com.example.lektioin_1_kotlin

import kotlin.jvm.internal.Intrinsics.Kotlin

fun main() {

    val c = 99
    val d: Int = 25
    val name = "Benny"

    println("Substring is 2: ${name.substring(2)} ")

    println("Printing out c $c and d $d")

    for (i in 10 downTo 0 step 2 ) {    // Option + Shift <
        println(i)
    }

    for (i in 10 downTo 0) {            // Count down
        println(i)
    }

    for (i in 0..10) {                  // Count up
        println(i)
    }

    val scores: IntArray = intArrayOf(0, 25, 50)                            // Cannot grow in size
    val scoresList: ArrayList<Int> = ArrayList(arrayListOf(0, 25, 1500))    // CAN grow in size

    // Two Dimensional Array SETUP
    val even: IntArray = intArrayOf(2, 4, 6)
    val odd: IntArray = intArrayOf(1, 3, 5)

    val twoDimensionalArray: Array<IntArray> = arrayOf(even, odd)


    scoresList.add(0)
    // DOES NOT EXIST scores.add()

    // Multidimensional Array - TODO Check more! https://stackoverflow.com/questions/34145495/2d-array-in-kotlin
    for (i in twoDimensionalArray) {
        println("Twodimensional: ${i [even[0] ] }")
    }


    for (i in scores) {             // For each (indices used to be important)
        println("index is: $i")
    }

    for (i in scoresList) {             // For each (indices used to be important)
        println("List index is: $i")
    }


    when (9) {
        0, 1 -> println("It's 0 or 1")
        2, 3 -> println("it's 2 or 3")

        else -> println("Not within range ")    // Default

    }


    val colors = setOf("Red", "Green", "Blue")

    for (color in colors) {
        println("Index is: $color")
        when(color) {
            "Red" -> { println("Red"); break }
            "Green" -> { println("Green");  }
            "Blue" -> println("This is blue")
        }
    }

    test()
    addition(5, 10)
    println(subtraction(5, 5))

} // Where MAIN ends

// Regular Fun
fun test() {
    println("Are we inside test method? ")
}

// Params
fun addition(x: Int, y: Int) {
    println(x+y)
    println("X + y is: ${ x + y }")
}

// Return
fun subtraction(x: Int, y: Int): Int {

    return x - y
}
