package basics
// immutable variable
val immutableVariable = "Immutable"

// mutable variable
var mutableVariable = "mutable"

/**
 * The type with only one value: the Unit object.
 * This type corresponds to the void type in Java.
 */
fun print(str: String) : Unit {
    println(str)
}

var printer: Unit = println("Hello Kotlin")

lateinit var any: Any

fun main(args: Array<String>) {
    any = "string type"
    any = 0
    any = true
}

fun elvisOperator(param: String?) : Int{
    return param?.length?:0
}
