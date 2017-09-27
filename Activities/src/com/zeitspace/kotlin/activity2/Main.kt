package com.zeitspace.kotlin.activity2

fun main(args: Array<String>) {
    val expected = mutableListOf<Int>()
    expected.add(Activity2Solution.performBinaryOperation(2, 7, Activity2Solution::add))
    expected.add(Activity2Solution.performBinaryOperation(11, 6, Activity2Solution.subtract))
    expected.add(Activity2Solution.performBinaryOperation(16, 10, { x, y -> x * y }))

    expected.add(Activity2Solution.subtract(1, 10))

    val result = mutableListOf<Int>()
    /* Uncomment after you've defined and implemented your methods */
//    result.add(Activity2.performBinaryOperation(2, 7, Activity2::add))
//    result.add(Activity2.performBinaryOperation(11, 6, Activity2.subtract))
//    result.add(Activity2.performBinaryOperation(16, 10, { x, y -> x * y }))
//
//    result.add(Activity2.subtract(1, 10))

    if (expected == result) {
        println("Your results were correct!")
    } else {
        println("Your results are: \n$result\nThe expected results are: \n$expected")
    }
}