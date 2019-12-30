fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val add = a + b
    val min = a - b
    val mul = a * b
    if (b <= 0) println(Math.max(min, mul))
    else println(Math.max(add, mul))
}
