package com.salhugues.splitz

import com.salhugues.splitz.data.Gender
import com.salhugues.splitz.data.Person

fun main() {
    println("Hello ${Person("Hugues", 42, Gender.MAN).name} !")
}