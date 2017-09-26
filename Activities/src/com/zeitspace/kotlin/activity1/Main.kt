package com.zeitspace.kotlin.activity1

fun main(args: Array<String>) {
    val expected = mutableListOf<String>()
    expected.add(activity1Soln("john_doe@mail.com", age = 26))
    expected.add(activity1Soln("sarah_connor@yahoo.com", "Sarah", "Connor"))
    expected.add(activity1Soln("baby@mail.com", firstName = "Baby", age = 1))

    val result = mutableListOf<String>()
    result.add(activity1("john_doe@mail.com", age = 26))
    result.add(activity1("sarah_connor@yahoo.com", "Sarah", "Connor"))
    result.add(activity1("baby@mail.com", firstName = "Baby", age = 1))

    println("Your results are: \n$result\nThe expected results are: \n$expected")
}