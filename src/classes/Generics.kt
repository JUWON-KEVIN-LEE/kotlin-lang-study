package classes

fun main(args: Array<String>) {
    val foodProduction : Production<Food> = FoodStore()
    val fastfoodProduction : Production<Food> = FastFoodStore()
    val burgerProduction : Production<Food> = BurgerStore()

    val foodConsumer : Consumer<Food> = Everybody()
    foodConsumer.consume(Food())
    foodConsumer.consume(FastFood())
    foodConsumer.consume(Burger())
    val fastfoodConsumer : Consumer<Burger> = ModernPeople()
    val burgerConsumer : Consumer<Burger> = American()
}

interface Production<out T> {
    fun produce(): T
}

interface Consumer<in T> {
    fun consume(item: T)
}

open class Food
open class FastFood : Food()
class Burger : FastFood()

class FoodStore : Production<Food> {
    override fun produce(): Food = Food()
}

class FastFoodStore : Production<FastFood> {
    override fun produce(): FastFood = FastFood()
}

class BurgerStore : Production<Burger> {
    override fun produce(): Burger = Burger()
}

class Everybody : Consumer<Food> {
    override fun consume(item: Food) {

    }
}

class ModernPeople : Consumer<FastFood> {
    override fun consume(item: FastFood) {

    }
}

class American : Consumer<Burger> {
    override fun consume(item: Burger) {

    }
}

