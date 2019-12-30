fun main(args: Array<String>) {
    val s = readLine()!!
    var ans = 0
    for (i in 0 until s.length / 2) {
        if (s[i] != s[s.length - 1 - i]) ans++
    }
    println(ans)
}