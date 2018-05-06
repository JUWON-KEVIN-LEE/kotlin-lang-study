package classes

class Person constructor(name: String?) {
    private val firstName = "First name : " +
            "${name?.split(" ")?.get(0)?:"unknown"}".also(::println)

    init {
        println("First Initializer block $firstName")
    }

    private val lastName = "Last name : " +
            "${name?.split(" ")?.get(1)?:"unknown"}".also(::println)

    init {
        println("Last Initializer block $lastName")
    }
}

class Customer private constructor(id: String) {



    companion object {
        private val customer: Customer? = null

        fun getInstance() : Customer {

            return customer?:Customer("ID")
        }
    }
}

class Train constructor(val lineNum: Int) {

    var color: String? = null

    constructor(lineNum: Int, color: String) : this(lineNum) {
        this.color = color
    }
}

fun main(args: Array<String>) {

}