fun main(args: Array<String>) {
    val (n,k) = readLine()!!.split(" ").map { it.toInt() }
    val monsters = readLine()!!.split(" ").map { it.toLong() }.sorted()
    println(if (n <= k) 0 else monsters.subList(0, n-k).reduce { acc, i -> acc + i })
}
