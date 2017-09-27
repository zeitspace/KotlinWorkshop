package com.zeitspace.kotlin.activity3

fun nullableAddSoln(x: Int?, y: Int?): Int = (x ?: 0) + (y ?: 0)

fun anyAddSoln(x: Int, y: Any?): Int = x + (y as? Int ?: 0)