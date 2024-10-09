fun main(args: Array<String>) {
    //nullability()
    //for_loops()
    when_expression()
}

fun when_expression() {
    val anyVal: Any = 33
    when(anyVal) {
        is String -> println("anyVal is a string")
        is Int -> println("anyVal is an int")
        else -> println("anyVal is something else")
    }

    val x = 10
    when(x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }

    val y = 20
    when(y) {
        10, 20 -> println("y is 10 or 20")
        else -> println("y is neither 10 nor 20")
    }

    val z = 30
    when(z) {
        in 1..10 -> println("z is between 1 and 10")
        !in 1..10 -> println("z is not between 1 and 10")
        else -> println("z is something else")
    }

    val a = 5
    when {
        a < 10 -> println("a is less than 10")
        a > 10 -> println("a is greater than 10")
        else -> println("a is 10")
    }

    val res = when {
        a < 10 -> "a is less than 10"
        a > 10 -> "a is greater than 10"
        else -> "a is 10"
    }
    println("res: $res")
}

fun for_loops() {
    val ints = intArrayOf(4, 3, 2, 1)
    for ((index, value) in ints.withIndex()) {
        println("$index : $value")
    }

    val capitals = mapOf("France" to "Paris", "Japan" to "Tokyo")
    for ((country, city) in capitals) {
        println("The capital of $country is $city")
    }
}

fun nullability() {
    val y: String? = "hello"
    val len: Int? = y?.length
    println(len)

    val y2: String? = null
    val len2: Int = y2?.length ?: -1
    println(len2)
}