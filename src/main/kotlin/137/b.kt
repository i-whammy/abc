fun main(args: Array<String>) {
    val (k, x) = readLine()!!.split(" ").map { it.toInt() }
    val ans = mutableListOf<Int>()
    for (i in x-k+1..x) ans.add(i)
    for (i in x+1 until x+k) ans.add(i)
    println(ans.joinToString(" "))
}
