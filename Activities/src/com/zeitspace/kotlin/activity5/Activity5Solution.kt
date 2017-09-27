package com.zeitspace.kotlin.activity5

fun List<String>.sumIntStringsSoln(): Int = this
    .map { it.toIntOrNull() ?: 0 }
    .reduce { acc, i -> acc + i }

fun List<Person>.getFavouriteFoodsSoln(fromCity: String = ""): List<String> = this
    .filter { it.city == fromCity || fromCity == "" }
    .map { it.favouriteFood }
    .distinct()

fun List<Person>.anybodyFromCitySoln(fromCity: String): Boolean = this
    .any { it.city == fromCity }

fun List<Person>.getAllSongsSoln(): List<String> = this
    .flatMap { it.favouriteSongs }
    .distinct()

fun List<Person>.getPeopleWithLotsOfSongsSoln(): List<Person> = this
    .partition { it.favouriteSongs.size > 1 }
    .first


