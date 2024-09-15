package syntax.lesson14

import java.util.Scanner

fun main() {
    val scanner: Scanner = Scanner(System.`in`)

    print("Enter your name : ")
    val name:String = scanner.next()

    print("Enter your age : ")
    val age: Int = scanner.nextInt()

    print("Your age : $age your name : $name")
    scanner.close()
}
