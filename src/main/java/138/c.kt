fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val v = readLine()!!.split(" ").map { it.toInt() }.sorted()
    var ans = 0.0
    for (i in 0 until n-1) {
        if (i == 0) ans = (v[0] + v[1]) / 2.0
        else ans = (ans + v[i+1]) / 2.0
    }
    println(ans)
}
