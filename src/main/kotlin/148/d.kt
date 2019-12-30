fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    var ans = n
    var cnt = 0
    for (i in 0 until n) {
        if (a[i] == cnt + 1) {
            cnt++
        }
    }
    println(if (cnt == 0) -1 else ans - cnt)
}