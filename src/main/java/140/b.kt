fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    val c = readLine()!!.split(" ").map { it.toInt() }
    var ans = 0
    for (i in 0 until n) {
        ans += b[a[i] - 1]
        if (i > 0 && a[i-1] + 1 == a[i]) ans += c[a[i - 1] - 1]
    }
    println(ans)
}
