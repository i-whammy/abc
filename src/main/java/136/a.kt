fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
    println(if (a - b >= c) 0 else c - (a - b))
}
