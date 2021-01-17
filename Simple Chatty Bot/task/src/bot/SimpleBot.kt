package bot

import java.util.*

const val botName = "BotPeterAkos"
const val creationDate = 2021
val scanner = Scanner(System.`in`)
fun main() {
    // write your code here
    println("Hello! My name is $botName")
    println("I was created in $creationDate")
    println("Please, remind me your name.")
    val userName = scanner.nextLine()
    println("What a great name you have, $userName!")
    //Age guessing
    println("Your age is ${nGuessedAge()}; that's a good time to start programming!")
    //Counting
    countUp()
    //Test Multiple choice
    multiChoice()
}

fun nGuessedAge(): Int {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val nRem3 = scanner.nextInt() * 70
    val nRem5 = scanner.nextInt() * 21
    val nRem7 = scanner.nextInt() * 15
    return (nRem3 + nRem5 + nRem7) % 105
}

fun countUp() {
    println("Now I will prove to you that I can count to any number you want.")
    val nEnd = scanner.nextInt()
    for (i in 0..nEnd) {
        println("$i!")
    }
    println("Completed, have a nice day!")
}

fun multiChoice() {
    var bAnswered = false
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2.To decompose a program into several small subroutines.")
    println("3.To determine the execution time of a program.")
    println("4.To interrupt the execution of a program.")
    while(!bAnswered)
    when (scanner.nextInt()) {
            1 -> println("Please, try again.")
            2 -> {
                println("Congratulations, have a nice day!")
                bAnswered = true
            }
            3 -> println("Please, try again.")
            4 -> println("Please, try again.")
        }
}