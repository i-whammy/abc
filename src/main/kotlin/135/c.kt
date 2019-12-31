fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toLong() }.toMutableList()
    val b = readLine()!!.split(" ").map { it.toLong() }.toMutableList()
    var ans = 0L
    for (i in 0 until n) {
        ans += Math.min(a[i], b[i])
        b[i] = Math.max(0, b[i]-a[i])
        ans += Math.min(a[i+1], b[i])
        a[i+1] = Math.max(0,a[i+1]-b[i])
    }
    println(ans)
}
