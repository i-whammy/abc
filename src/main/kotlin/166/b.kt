fun main(args: Array<String>) {
    val (n,k) = readLine()!!.split(" ").map { it.toInt() }
    val points = MutableList(n) { 0 }
    for (i in 0 until n) {
        val d = readLine()!!.toInt()
        readLine()!!.split(" ").map { it.toInt() - 1 }.forEach{ points[it]++ }
    }
    println(points.count { it == 0 })
}

