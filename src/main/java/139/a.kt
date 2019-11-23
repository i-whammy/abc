fun main(args: Array<String>) {
    val s = readLine()!!
    val t = readLine()!!
    var ans = 0
    for (i in 0 until 3) {
        if (s[i] == t[i]) ans++
    }
    println(ans)
}
