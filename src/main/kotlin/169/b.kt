fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }
    if (0L in a) return println(0)
    var answer = 1L
    for (i in a) {
        val j = answer
        answer *= i
        if (answer > 1_000_000_000_000_000_000 || answer / i != j) return println(-1)
    }
    println(answer)
}

