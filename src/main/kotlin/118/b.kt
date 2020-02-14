fun main(args: Array<String>) {
    val (n,m) = readLine()!!.split(" ").map { it.toInt() }
    val map = mutableMapOf<Int, Int>()
    var a = Array(m) {i -> i+1}.forEach { map[it] = 0 }
    for (i in 0 until n) {
        val numbers = readLine()!!.split(" ").map { it.toInt() }
        for (j in 1..numbers[0]) {
            val i1 = map[numbers[j]]!!
            map[numbers[j]] = i1 + 1
        }
    }
    println(map.values.count{ it == n })
}

