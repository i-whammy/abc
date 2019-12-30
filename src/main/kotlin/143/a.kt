fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    if (a - b * 2 <= 0) println(0) else println(a - b * 2)
}