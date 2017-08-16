package com.zeitspace.kotlinworkshop.model

data class AppUser(val firstName: String = "", val lastName: String = "", val email: String, val passwordHash: Int) {
    companion object {
        fun hash(password: String) = password.map { it.hashCode() }.reduce { acc, i -> (acc / 3) * if (i == 0) 1 else i }

        fun newUser(firstName: String = "", lastName: String = "", email: String, password: String) =
            AppUser(firstName, lastName, email, hash(password))
    }
}

fun Array<AppUser>.login(email: String, password: String): AppUser? {
    val hash = AppUser.hash(password)
    return find { email == it.email && hash == it.passwordHash }
}