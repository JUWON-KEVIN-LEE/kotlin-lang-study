package basics

fun main(args: Array<String>) {
    loop@ for(i in 1..100) {
        for(j in 1..100) {
            if(j == 88) break@loop
        }
    }

    foo() // 1 2 4 5 basics.foo
}

fun foo() {
    run {  }
    listOf(1,2,3,4,5).forEach {
        if(it == 3) return@forEach
        println(it)
    }
    println("basics.foo")
}