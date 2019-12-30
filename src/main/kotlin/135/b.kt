fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val p = readLine()!!.split(" ").map { it.toInt() }
    var cnt = 0
    for (i in 0 until n) {
        if (p[i] != i + 1 && p[p[i] - 1] != i + 1) return println("NO")
        if (p[i] != i + 1) cnt++
    }
    println(if (cnt <= 2) "YES" else "NO")
}
