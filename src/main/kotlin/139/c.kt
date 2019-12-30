fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val h = readLine()!!.split(" ").map { it.toInt() }
    var ans = 0
    var cnt = 0
    for (i in 0 until n) {
        if (i != n - 1 && h[i] >= h[i+1]) {
            cnt++
        }
        if (i == n - 1 || h[i] < h[i+1]) {
            if (ans < cnt) {
                ans = cnt
            }
            cnt = 0
        }
    }
    println(ans)
}
