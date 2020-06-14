fun main(args: Array<String>) {
    val (n,m) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    val sum = a.reduce{ r1,r2 -> r1 + r2 }
    println(Math.max(-1, n - sum))
}
