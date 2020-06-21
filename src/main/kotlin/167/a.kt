fun main(args: Array<String>) {
    val s = readLine()!!
    val t = readLine()!!
    println(if (t.substring(0,s.length) == s) "Yes" else "No")
}