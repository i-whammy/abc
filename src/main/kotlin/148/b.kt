fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val (s,t) = readLine()!!.split(" ")
    var ans = ""
    for (i in 0 until n) {
        ans += s[i]
        ans += t[i]
    }
    println(ans)
}