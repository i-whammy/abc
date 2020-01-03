fun main(args: Array<String>) {
    val (n,k) = readLine()!!.split(" ").map { it.toDouble() }
    var ans = 0.0
    for (i in 1..n.toInt()) {
        var times = 0.0
        var base = i
        while (base < k) {
            base *= 2
            times += 1.0
        }
        ans += Math.pow(0.5, times) / n
    }
    println(ans)
}
