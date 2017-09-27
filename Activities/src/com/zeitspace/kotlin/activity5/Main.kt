package com.zeitspace.kotlin.activity5

fun main(args: Array<String>) {
    val people = listOf(
        Person("Bill", "Toronto", "Pizza", listOf("All Star")),
        Person("Sarah", "Kitchener", "Ice Cream", listOf("Bohemian Rhapsody", "Party Rock Anthem", "I Gotta Feeling")),
        Person("Sally", "Waterloo", "Chicken", listOf("Macarena", "Hey Jude", "Uptown Funk!")),
        Person("Bob", "Toronto", "Burgers", listOf("Bohemian Rhapsody")),
        Person("Jenny", "Kitchener", "Candy", listOf("Never Gonna Give You Up", "Bohemian Rhapsody", "Uptown Funk!"))
    )
    val numbers = listOf(
        "1",
        "8",
        "-6",
        "0"
    )

    val expected = mutableListOf<String>()
    expected.add(numbers.sumIntStringsSoln().toString())
    expected.add(people.getFavouriteFoodsSoln().toString())
    expected.add(people.getFavouriteFoodsSoln("Waterloo").toString())
    expected.add(people.anybodyFromCitySoln("Toronto").toString())
    expected.add(people.anybodyFromCitySoln("Waterloo").toString())
    expected.add(people.anybodyFromCitySoln("Milton").toString())
    expected.add(people.getAllSongsSoln().toString())
    expected.add(people.subList(0, 2).getAllSongsSoln().toString())
    expected.add(people.getPeopleWithLotsOfSongsSoln().toString())

    val result = mutableListOf<String>()
    result.add(numbers.sumIntStrings().toString())
    result.add(people.getFavouriteFoods().toString())
    result.add(people.getFavouriteFoods("Waterloo").toString())
    result.add(people.anybodyFromCity("Toronto").toString())
    result.add(people.anybodyFromCity("Waterloo").toString())
    result.add(people.anybodyFromCity("Milton").toString())
    result.add(people.getAllSongs().toString())
    result.add(people.subList(0, 2).getAllSongs().toString())
    result.add(people.getPeopleWithLotsOfSongs().toString())

    if (expected == result) {
        println("Your results were correct!")
    } else {
        println("Your results are: \n$result\nThe expected results are: \n$expected")
    }
}