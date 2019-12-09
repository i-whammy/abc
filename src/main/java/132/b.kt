fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val p = readLine()!!.split(" ").map { it.toInt() }
    var ans = 0
    for (i in 1 until n-1) {
        if ((p[i-1] < p[i] && p[i] < p[i+1]) || (p[i-1] > p[i]) && (p[i] > p[i+1])) ans++
    }
    println(ans)
}
