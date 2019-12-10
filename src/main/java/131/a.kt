fun main(args: Array<String>) {
    val s = readLine()!!
    println(if (s[0] == s[1] || s[1] == s[2] || s[2] == s[3]) "Bad" else "Good")
}
