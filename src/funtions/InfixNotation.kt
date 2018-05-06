package funtions

fun main(args: Array<String>) {
    val a = 2 infix 3
    println("$a")
}

infix fun Int.infix(x: Int): Int {
    return this.plus(x).div(2)
}