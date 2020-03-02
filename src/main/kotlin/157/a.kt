fun main(args: Array<String>) {
    val num = readLine()!!.toInt()
    println(if (num % 2 == 1) num / 2 + 1 else num / 2)
}