fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    var cnt = 1
    for (i in 0..n-2) {
        if (s[i] != s[i+1]) cnt++
    }
    println(cnt)
}