fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val b = readLine()!!.split(" ").map { it.toInt() }
    var ans = b[0] + b[n-2]
    for (i in 0 until n-2) {
        ans += if (b[i] > b[i+1]) b[i+1] else b[i]
    }
    println(ans)
}
