fun main(args: Array<String>) {
    //var_declarations()
    //ranges()
    //arrays()
    characters_and_strings()
}

fun characters_and_strings() {
    val a = 'x'
    if(a.code == 120) {
        println("a is x")
    }
}

fun arrays() {
    var names: Array<String> = arrayOf("John", "Doe", "Jane")
    names[0] = "Jack"
    println(names.toList())

    //val values = Array<Double>(10, {2.0})
    val values = Array(10, {2.0})
    println(values.toList())

    val squares = Array(10, {(it * it).toString()})
    println(squares.toList())
}

fun ranges() {
    //val a: IntRange = 1..10
    val a = (1..10).reversed()
    for (x in a) {
        println(x)
    }
    println("sum of ints: $a = ${a.sum() }")

    var b = 10 downTo 1
    for (x in b) {
        println(x)
    }

}

fun var_declarations() {
    val a: Int = 64
    val b: Long = 123
    val c: Float = 2.3f
    val d: Double = 12.3e5

    println("$a\n$b\n$c\n$d")

    val e: Int
    e = a

    println(e)

    val f: StringBuffer = StringBuffer("test")
    f.replace(0, 1, "T")
    println(f)

    var g: Int = 123
    g = 45
    println(g)
}