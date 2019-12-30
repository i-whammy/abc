fun main(args: Array<String>) {
    val (a,b) = readLine()!!.split(" ").map { it.toInt() }
    when {
        a <= 5 -> println(0)
        a <= 12 -> println(b / 2)
        else -> println(b)
    }
}
