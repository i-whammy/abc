fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    println(if (n % 1000 != 0) 1000 - n % 1000 else 0)
}