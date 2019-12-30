fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    val h = readLine()!!.split(" ").map { it.toInt() }
    var ans = 0
    for (i in 0 until n) {
        if (h[i] >= k) ans++
    }
    println(ans)
}
