package com.zeitspace.kotlin.activity3

fun main(args: Array<String>) {
    val expected = mutableListOf<Int>()
    expected.add(nullableAddSoln(2, null))
    expected.add(nullableAddSoln(null, 4))
    expected.add(anyAddSoln(100, 256))
    expected.add(anyAddSoln(100, "256"))
    expected.add(anyAddSoln(200, null))

    val result = mutableListOf<Int>()
    result.add(nullableAdd(2, null))
    result.add(nullableAdd(null, 4))
    result.add(anyAdd(100, 256))
    result.add(anyAdd(100, "256"))
    result.add(anyAdd(200, null))

    println("Your results are: \n$result\nThe expected results are: \n$expected")
}