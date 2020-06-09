fun main(args: Array<String>) {
    val s = readLine()!!.toInt()
    println(s / 500 * 1000 + s % 500 / 5 * 5)
}