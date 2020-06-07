fun main(args: Array<String>) {
    val (n,m) = readLine()!!.split(" ").map { it.toInt() }
    println ((n + m) * (n + m - 1) / 2 - n * m)
}