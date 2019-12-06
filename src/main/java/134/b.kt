fun main(args: Array<String>) {
    val (n, d) = readLine()!!.split(" ").map { it.toInt() }
    println(if (n % (d * 2 + 1) == 0) n / (d * 2 + 1) else n / (d * 2 + 1) + 1)
}
