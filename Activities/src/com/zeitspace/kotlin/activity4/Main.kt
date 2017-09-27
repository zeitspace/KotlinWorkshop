package com.zeitspace.kotlin.activity4

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>) {
    val myData1 = MyData("No Name", 2, "Nowhere")
    val myData2 = myData1.copy()
    val obj1 = JvmType.Object("obj1")
    val obj2 = JvmType.Object("obj2")

    val expected = mutableListOf<String>()
    expected.add(switchSoln(1, { "one" }, { "two" }, { "more" }))
    expected.add(switchSoln(2, { "one" }, { "two" }, { "more" }))
    expected.add(switchSoln(3, { "one" }, { "two" }, { "more" }))
    expected.add(switchSoln(4, { "one" }, { "two" }, { "more" }))
    expected.add(switchSoln(5, { "one" }, { "two" }, { "more" }))
    expected.add(switchSoln(6, { "one" }, { "two" }, { "more" }))

    withStatementSoln(myData1)
    expected.add(myData1.name)
    expected.add(myData1.age.toString())
    expected.add(myData1.hometown)

    expected.add(switchTypeSoln("String"))
    expected.add(switchTypeSoln(200))
    expected.add(switchTypeSoln(5))
    expected.add(switchTypeSoln(200f))
    expected.add(switchTypeSoln(5f))
    expected.add(switchTypeSoln(myData1))
    expected.add(switchTypeSoln(obj1))

    val result = mutableListOf<String>()
    result.add(switch(1, { "one" }, { "two" }, { "more" }))
    result.add(switch(2, { "one" }, { "two" }, { "more" }))
    result.add(switch(3, { "one" }, { "two" }, { "more" }))
    result.add(switch(4, { "one" }, { "two" }, { "more" }))
    result.add(switch(5, { "one" }, { "two" }, { "more" }))
    result.add(switch(6, { "one" }, { "two" }, { "more" }))

    withStatement(myData2)
    result.add(myData2.name)
    result.add(myData2.age.toString())
    result.add(myData2.hometown)

    result.add(switchType("String"))
    result.add(switchType(200))
    result.add(switchType(5))
    result.add(switchType(200f))
    result.add(switchType(5f))
    result.add(switchType(myData2))
    result.add(switchType(obj2))

    println("Your results are: \n$result\nThe expected results are: \n$expected")
}