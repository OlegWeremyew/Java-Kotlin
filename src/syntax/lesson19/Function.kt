package syntax.lesson19

fun main() {
    println("The sum of first ten numbers is ${getSumOfNumbers(10)}")
    println("The sum of first twenty numbers is ${getSumOfNumbers(20)}")
    println("The sum of first 999999999999 numbers is ${getSumOfNumbers(999999999)}")

    println("The sum of two ${getSumIfTwoNumbers(3, 7)}")

    // we use function from Java class
    println("The sum of two ${Function.sumOfNumbers(10, 12)}")
    println("Invoke Arrow func ${arrowFunc(10, 12)}")
}

fun getSumOfNumbers(number: Int): Long  {

    var count = 0
    var sum = 0L

    while (count < number) {
        count += 1
        sum += count
    }

    return sum
}

fun getSumIfTwoNumbers(firs: Int, second: Int): Long {
    // up format to long
    return (firs +second).toLong()
}

fun arrowFunc(firs: Int, second: Int) = (firs +second).toLong()
