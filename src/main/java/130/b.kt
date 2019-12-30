fun main(args: Array<String>) {
    val (n, x) = readLine()!!.split(" ").map { it.toInt() }
    val l = readLine()!!.split(" ").map { it.toInt() }
    var ans = 1
    var bounds = 0
    for (i in 0 until n) {
        bounds += l[i]
        if (bounds > x) {
            return println(ans)
        } else {
            ans++
        }
    }
    println(ans)
}
