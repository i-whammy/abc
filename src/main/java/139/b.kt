fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    var ans = 0
    var cnt = 1
    while (cnt < b) {
        cnt += (a - 1)
        ans++
    }
    println(ans)
}
