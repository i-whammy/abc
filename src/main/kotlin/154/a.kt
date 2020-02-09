fun main(args: Array<String>) {
    val (s,t) = readLine()!!.split(" ")
    val (a,b) = readLine()!!.split(" ").map { it.toInt() }
    val u = readLine()!!
    println(if (u == s) (a-1).toString() + " " + b else a.toString() + " " + (b - 1))
}