package com.zeitspace.kotlin.activity2

object Activity2Solution {

    inline fun add(x: Int, y: Int) = x + y

    val subtract = { x: Int, y: Int -> x - y }

    fun performBinaryOperation(operandX: Int, operandY: Int, operator: (x: Int, y: Int) -> Int): Int {
        return operator(operandX, operandY)
    }

}