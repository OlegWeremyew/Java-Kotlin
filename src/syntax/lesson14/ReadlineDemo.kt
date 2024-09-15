package syntax.lesson14

fun main() {
    print("Enter your name : ")
    val name: String = readLine() ?: ""

    print("Enter your age : ")
    val age: Int = readLine()?.toIntOrNull() ?: 0

    println("Your age : $age your name : $name")
}
