fun main(args: Array<String>) {
    val n = readLine()!!.toLong()
    if (n % 2 == 1L) return println(0)
    var ans = 0L
    var num = 10L
    while (n / num != 0L) {
        ans += n / num
        num *= 5
    }
    println(ans)
}