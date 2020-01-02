fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Pair<Int, Int>>()
    for (i in 0 until n) {
        list.add(readLine()!!.split(" ").map { it.toInt() }.let { Pair(it.first(), it.last()) })
    }
    var sum = 0.0
    for (i in 0 until n) {
        for (j in 0 until n) {
            sum += Math.sqrt(Math.pow(list[j].second.toDouble() - list[i].second.toDouble(), 2.0)
                    + Math.pow(list[j].first.toDouble() - list[i].first.toDouble(), 2.0))
        }
    }
    println(sum / n)
}
