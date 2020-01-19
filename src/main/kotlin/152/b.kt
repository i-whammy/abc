fun main(args: Array<String>) {
    val (a,b) = readLine()!!.split(" ").map { it.toInt() }
    println(Math.min(a,b).toString().repeat(Math.max(a,b)))
}