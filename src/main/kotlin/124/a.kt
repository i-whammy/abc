fun main(args: Array<String>) {
    val (a,b) = readLine()!!.split(" ").map { it.toInt() }
    if (a > b + 1) println(2 * a -1)
    else if (a + 1 < b) println(2 * b -1)
    else println(a+b)
}
