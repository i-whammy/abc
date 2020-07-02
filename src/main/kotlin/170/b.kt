fun main(args: Array<String>) {
    val (x,y) = readLine()!!.split(" ").map { it.toInt() }
    for (i in 0..x) {
        if (i * 2 + (x - i) * 4 == y) return println("Yes")
    }
    println("No")
}
