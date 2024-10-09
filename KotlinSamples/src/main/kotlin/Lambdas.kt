package KotlinSamples.Lambdas

fun main(args: Array<String>) {
    //val product = {x: Int, y: Int -> x * y}
    val product: (Int, Int) -> Int = { x, y -> x * y }
    println(product(2, 3))

    val numbers = listOf(1, 2, 3, 4, 5)
    //val n = numbers.count { x -> x > 3 }
    val n = numbers.count { it > 3 }
    println(n)

    // closures
    var sum = 0
    numbers.forEach { sum += it }
    println(sum)

}