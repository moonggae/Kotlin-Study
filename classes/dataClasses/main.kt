package classes.dataClasses

fun main() {
    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    secondUser.count = 40

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    println("user.hashCode(): ${user.hashCode()}")
    println("secondUser.hashCode(): ${secondUser.hashCode()}")
    println("thirdUser.hashCode(): ${thirdUser.hashCode()}")

    println("user.copy(): ${user.copy()}")
    println("user == user.copy(): ${user == user.copy()}")
    println("user === user.copy(): ${user === user.copy()}")
    println("user.copy(\"Max\"): ${user.copy("Max")}")
    println("user == user.copy(\"Max\"): ${user == user.copy("Max")}")

    println("user.component1(): ${user.component1()}")
    println("user.component2(): ${user.component2()}")

    val choi = User("choi", 300)
    val (name, id) = choi
    println("choi name: $name")
    println("choi id: $id")
}