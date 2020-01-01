fun main(args: Array<String>) {
    val (n,m) = readLine()!!.split(" ").map { it.toInt() }
    var ans = Pair(1,100000)
    for (i in 0 until m) {
        val (l,r) = readLine()!!.split(" ").map { it.toInt() }
        ans = Pair(Math.max(l, ans.first), Math.min(r, ans.second))
    }
    println(Math.max(ans.second-ans.first + 1, 0))
}
