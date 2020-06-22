fun main(args: Array<String>) {
    val (n,k)= readLine()!!.split(" ").map { it.toInt() }
    val sorted = readLine()!!.split(" ").map { it.toInt() }.sorted()
    println(sorted.subList(0, k).reduce { acc, i -> acc + i })
}

