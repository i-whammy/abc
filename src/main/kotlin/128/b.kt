fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var m = mutableListOf<Pair<String, Int>>()
    for (i in 0 until n) {
        val (a, b) = readLine()!!.split(" ")
        m.add(a to b.toInt())
    }
    val sorted = m.sortedWith(compareBy({ it.first }, { it.second * -1 }))
    sorted.map { println(m.indexOf(it) + 1)}
}
