fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var ans: Int
    if (n == 100000) return println(90909)
    if (n > 9999) ans = n - 9999 + 909
    else if (n > 999) ans = 909
    else if (n > 99) ans = n - 99 + 9
    else if (n > 9) ans = 9
    else ans = n
    println(ans)
}
