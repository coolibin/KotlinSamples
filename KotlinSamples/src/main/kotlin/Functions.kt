package KotlinSamples.Functions

fun main(args: Array<String>) {
    //println(calculate_wages(40, 15.0))
    //println(calculate_wages(hourly_rate = 40.0))
    //println(sum_up(1, 2, 3, 4, 5))

    //val stuff = intArrayOf(1, 2, 3)
    //println(sum_up(3, 5, *stuff, 1, 9))

    //val (x1, x2) = solve_quadratic_equation(1.0, -5.0, 6.0)
    //println("x1 = $x1, x2 = $x2")

    infix_functions()
}

infix fun Double.averagedWith(other: Double): Double = (this + other) / 2

fun infix_functions() {
    val x = 'z' downTo 'a'
    val captials = mapOf("France" to "Paris", "Japan" to "Tokyo")

    val a = 3.0
    val b = 10.0

    println("The average of $a and $b is ${a averagedWith b}")

}

fun say_hello(): Unit {
    println("Hello, world!")
}

fun triple(x: Int): Int = x * 3

fun calculate_wages(hours_worked: Int = 160, hourly_rate: Double = 100.0): Double {
    return hours_worked * hourly_rate
}

fun sum_up(vararg numbers: Int): Int = numbers.sum()

fun solve_quadratic_equation(a: Double, b: Double, c: Double): Pair<Double, Double> {
    fun calculate_discriminant(a: Double, b: Double, c: Double): Double = b * b - 4 * a * c

    val root_disc = Math.sqrt(calculate_discriminant(a, b, c))
    return Pair((-b + root_disc) / (2 * a), (-b - root_disc) / (2 * a))
}