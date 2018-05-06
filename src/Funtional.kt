
fun main(args: Array<String>) {

    println(value())
    println(lazyValue) // memory
}

fun <T>lambda(body: () -> T) : T {
    return body()
}

val higherOrderFunction : (Int, Int) -> Int = { x, y -> x + y }

val value : () -> String = { "Hello" }

val lazyValue : String by lazy { "Funtional Programming" }