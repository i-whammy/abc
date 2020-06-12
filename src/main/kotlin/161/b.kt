fun main(args: Array<String>) {
    val (n,m) = readLine()!!.split(" ").map { it.toDouble() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    val sum = a.reduce { acc, i -> acc + i }
    if (a.sortedDescending()[m.toInt()-1] >= sum / (4 * m)) println("Yes") else println("No")
}