fun main(args: Array<String>) {
    val (r,d,x) = readLine()!!.split(" ").map { it.toInt() }
    var current = x
    for (i in 1..10) {
        current = r * current - d
        println(current)
    }
}
