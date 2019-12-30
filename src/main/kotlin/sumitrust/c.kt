fun main(args: Array<String>) {
    val x = readLine()!!.toInt()
    if (x < 100) return println(0)
    val items = x / 100
    val remain = x % 100
    println(if (items * 5 >= remain) 1 else 0)
}
