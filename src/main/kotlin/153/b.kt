fun main(args: Array<String>) {
    val (h,n) = readLine()!!.split(" ").map { it.toInt() }
    val attacks = readLine()!!.split(" ").map { it.toInt() }
    println(if (attacks.reduce { acc, i -> acc + i } >= h) "Yes" else "No")
}