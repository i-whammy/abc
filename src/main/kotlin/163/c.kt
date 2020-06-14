fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val sum = MutableList(n) { 0 }
    a.map { sum[it-1]++ }
    sum.forEach { println(it) }
}
