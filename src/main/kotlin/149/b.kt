fun main(args: Array<String>) {
    val (a,b,k) = readLine()!!.split(" ").map { it.toLong() }
    val ansA = Math.max(a-k, 0)
    val ansK = Math.max(k-a,0)
    val ansB = Math.max(b-ansK,0)
    println("$ansA $ansB")
}