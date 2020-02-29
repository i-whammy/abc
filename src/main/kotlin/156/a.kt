fun main(args: Array<String>) {
    val (n,r) = readLine()!!.split(" ").map { it.toInt() }
    println(if (n >= 10) r else r + 100 * (10-n))
}