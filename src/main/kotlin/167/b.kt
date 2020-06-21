fun main(args: Array<String>) {
    val (a,b,c,k) = readLine()!!.split(" ").map { it.toInt() }
    println(Math.min(k, a) - Math.max(0, Math.min(c, k-a-b)))
}

