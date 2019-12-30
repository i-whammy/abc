fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    println("%.10f".format((n - (n/2).toDouble()) / n))
}