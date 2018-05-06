package basics

fun main(args: Array<String>) {
    val singleton : Singleton = Singleton.instance // Singleton init /w address = basics.Singleton@2e817b38
    singleton.value = "Hello, World!"

    // init { 호출되지 않는다. }
    val secondCall : Singleton = Singleton.instance
    println(secondCall.value) // Hello, World!
}

class Singleton private constructor() {

    var value : String? = null

    init { println("Singleton init /w address = $this") }

    private object Holder { val INSTANCE = Singleton() }

    companion object {
        val instance : Singleton by lazy { Holder.INSTANCE }
    }
}