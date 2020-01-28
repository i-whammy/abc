fun main(args: Array<String>) {
    val (n,m,c) = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    for (i in 0 until n) {
        val a = readLine()!!.split(" ").map { it.toInt() }
        var answer = c
        for (j in 0 until m) {
            answer += a[j] * b[j]
        }
        if (answer > 0) count++
    }
    println(count)
}
