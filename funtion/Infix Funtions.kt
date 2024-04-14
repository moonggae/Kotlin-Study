package funtion


fun main() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Times ")

    val pair = "First" to "Second"
    println(pair)

    val first = Calculator(10)
    val second = Calculator(30)
    println(first add 20)
    println(first add second)
}

class Calculator(val number: Int) {
    infix fun add (otherNumber: Int) = number + otherNumber
    infix fun add (other: Calculator) = number + other.number
}