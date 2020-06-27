fun main(args: Array<String>) {
    val (n,m) = readLine()!!.split(" ").map { it.toInt() }
    var answer = ""
    val rules = mutableSetOf<Pair<Int,Int>>()
    repeat(m) {
        rules.add(readLine()!!.split(" ").map { it.toInt() }.let { Pair(it.first(),it.last()) })
    }
    if (rules.groupBy { it.first }.filter { it.value.size > 1 }.isNotEmpty()) return println(-1)
    if (rules.any { it.first == 1 && it.second == 0 } && n != 1) return println(-1)
    if (!rules.any { it.first == 1 && it.second != 0 } && n == 1) return println(0)
    for (i in 1..n) {
        if (rules.any { it.first == i }) answer += rules.first { it.first == i }.second.toString()
        else if (i == 1) answer += "1"
        else answer += "0"
    }
    println(answer)
}
