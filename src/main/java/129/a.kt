fun main(args: Array<String>) {
    val s = readLine()!!.split(" ").map { it.toInt() }.sorted()
    println(s[0] + s[1])
}
