package com.zeitspace.kotlin.activity4

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun switchSoln(option: Int, option1: () -> String, option2: () -> String, option345: () -> String): String {
    return when (option) {
        1 -> option1()
        2 -> option2()
        3, 4, 5 -> option345()
        else -> "Else"
    }
}

fun withStatementSoln(obj: MyData) = with(obj) {
    age = 25
    name = "Billy Joe"
    hometown = "The Moon"
}

fun switchTypeSoln(someData: Any): String = when (someData) {
    is String -> someData
    is Int -> if (someData > 100) "Big int" else "Little int"
    is Float -> if (someData > 100) "Big float" else "Little float"
    is JvmType.Object -> someData.toString()
    else -> "I don't know"
}

