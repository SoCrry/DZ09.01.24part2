package ru.netology

fun main() {
    val likes = 2
val calculatorPeople =likes % 100

val result = if(calculatorPeople===1||calculatorPeople===21||calculatorPeople===31||calculatorPeople===41||calculatorPeople===51||calculatorPeople===61||calculatorPeople===71||calculatorPeople===81||calculatorPeople===91||calculatorPeople===101) {
    "человеку"
} else {
    "людям"
}
    println("Понравилось $likes $result")
}