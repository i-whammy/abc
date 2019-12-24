fun main(args: Array<String>) {
    val (a,b) = readLine()!!.split(" ").map{ it.toLong() }
    for (i in 1..b) {
        if (a * i % b == 0L) {
            println(a * i)
            return
        }
    }
    println(a*b)
}