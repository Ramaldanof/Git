package com.example.git.Lesson

fun main() {
    getRegexCard()
    getResultRegex()
}

private fun getRegexCard() {
    val regex = Regex(pattern = """\d{4}-\d{4}-\d{4}-\d{4}""")
    val matched = regex.containsMatchIn(input = "1212-1212-1212-1212")
    println(matched)
}

private fun getResultRegex() {
    val regex = Regex(readln())
    val matched = regex.containsMatchIn("Salam")
    if (matched) {
        println(regex)
    } else {
        println("Daxil etdiyiniz regexe uygun deyil")
    }
}


