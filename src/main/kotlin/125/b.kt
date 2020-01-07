fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val v = readLine()!!.split(" ").map { it.toInt() }
    val c = readLine()!!.split(" ").map { it.toInt() }
    var ans = 0
    for (i in 0 until n) {
        if (v[i]-c[i]>0) ans += (v[i]-c[i])
    }
    println(ans)
}
