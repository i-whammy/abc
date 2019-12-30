fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    var ans = 0.0
    for (i in 0 until n) {
        val b = a[i]
        ans += 1.0 / b
        println(b)
    }
    println(1.0 / ans)
}
