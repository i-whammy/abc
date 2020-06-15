fun main(args: Array<String>) {
    val (a,b) = readLine()!!.split(" ").map { it.toBigDecimal() }
    println((a * b).toLong())
}
