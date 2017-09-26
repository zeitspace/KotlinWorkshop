package com.zeitspace.kotlin.activity1

fun activity1Soln(email: String, firstName: String = "John", lastName: String = "Doe", age: Int = 18): String {
    return "$email belongs to $firstName $lastName who is $age ${if (age > 1) "years" else "year"} old."
}