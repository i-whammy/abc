fun main(args: Array<String>) {
    val a = readLine()!!.split(" ").map { it.toInt() }
    println(a.indexOf(0) + 1)
}
