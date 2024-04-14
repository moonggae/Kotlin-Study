package funtion

operator fun Int.times(str: String) = str.repeat(this)
operator fun String.get(range: IntRange) = substring(range)
operator fun Calculator.compareTo(number: Int) = this.number.compareTo(number)

fun main() {
    println(3 * "Repeat ")

    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..10])

    val first = Calculator(50)
    println(first >= 20) // => first.number.compareTo(20) >= 0
    println(first <= 20)
}