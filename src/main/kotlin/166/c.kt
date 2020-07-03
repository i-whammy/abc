fun main(args: Array<String>) {
    val (n,m) = readLine()!!.split(" ").map { it.toInt() }
    val h = readLine()!!.split(" ").map { it.toInt() }
    val results = Array<Boolean>(n) { true }
    repeat(m) {
        val (a,b) = readLine()!!.split(" ").map { it.toInt() }
        if (h[a-1] <= h[b-1]) results[a-1] = false
        if (h[b-1] <= h[a-1]) results[b-1] = false
    }
    println(results.count { it })
}

