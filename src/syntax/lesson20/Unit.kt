package syntax.lesson20

fun main() {
    var multiply = { a: Int, b: Int -> println("result ${a * b}") }
    multiply(3, 6)

    var multiply2: (Int, Int) -> Unit = { a, b -> println("result ${a * b}") }
    multiply2(3, 16)

    multiply3(3, 4)
}

//the same only named function
fun multiply3(a: Int, b: Int): Unit {
    println(a * b)
}

