fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val h = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    var ans = true
    for (i in n-1 downTo 1) {
        println(i)
        if (h[i-1] <= h[i]) continue
        if (h[i-1] - 1 == h[i]) {
            h[i-1] -= 1
        } else {
            ans = false
        }
    }
    println (if (ans) "Yes" else "No")
}
