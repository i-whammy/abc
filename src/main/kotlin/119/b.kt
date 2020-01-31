fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var answer = 0.0
    for (i in 0 until n) {
        val (value, currency) = readLine()!!.split(" ")
        answer += if (currency == "JPY") value.toDouble() else value.toDouble() * 380000.0
    }
    println(answer)
}

