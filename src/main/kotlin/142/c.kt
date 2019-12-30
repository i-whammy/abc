fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").mapIndexed { index, a -> Pair(a.toInt(), index + 1) }.sortedBy { it.first }
    println(a.map{it.second}.joinToString(" "))
}
