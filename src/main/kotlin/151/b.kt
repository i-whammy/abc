fun main(args: Array<String>) {
    val (n,k,m) = readLine()!!.split(" ").map { it.toInt() }
    val scores = readLine()!!.split(" ").map { it.toInt() }
    val total = scores.reduce { acc, i -> acc + i }
    println(if (total + k < m * n) "-1" else Math.max(m * n - total,0))
}