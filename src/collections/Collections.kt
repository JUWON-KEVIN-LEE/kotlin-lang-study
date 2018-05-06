package collections

fun main(args: Array<String>) {

    val list = listOf(1, 2, 3, 10, 100, 1000)
    /*
    Performs the given [action] on each element.
    @kotlin.internal.HidesMembers
    public inline fun <T> Iterable<T>.forEach(action: (T) -> Unit): Unit {
        for (element in this) action(element)
    }
    */
    list.map { it*2 }
            .forEach { basics.print("item : $it") }

    list.filter { it <= 10 }
            .map { it * it }
            .forEach { basics.print("item: $it") }

    val total = list.fold(0, { total, next -> total.plus(next) })
    println("total of list : $total") // 1116

    list.extensions{ println("hello kotlin $it") }

    val people: MutableList<Person> = mutableListOf(
            Person("이주원", 26, "collections.male"),
            Person("정선희", 25, "female"),
            Person("김길동", 32, "collections.male"),
            Person("이지은", 26, "female"))

    val map: MutableMap<String, Person> = mutableMapOf(
            "ID_0" to Person("이주원", 26, "collections.male"),
            "ID_1" to Person("정선희", 25, "female"),
            "ID_2" to Person("김길동", 32, "collections.male")
    )

    val hashMap: HashMap<String, Person> = hashMapOf()
}

data class Person(val name: String,
                  val age: Int,
                  val gender: String)

inline fun <T> Iterable<T>.extensions(action: (T) -> Unit) : Unit {
    for(element in this) action(element)
}

fun male(data: List<Person>) : List<Person> { // faster
    val male: MutableList<Person> = mutableListOf()
    for(element in data) { if("collections.male" == element.gender) male.add(element) }
    return male
}

inline fun Iterable<Person>.male(): List<Person> {
    val male: MutableList<Person> = mutableListOf()
    for(element in this) { if("collections.male" == element.gender) male.add(element) }
    return male
}