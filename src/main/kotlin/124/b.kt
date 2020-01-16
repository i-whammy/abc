fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val h = readLine()!!.split(" ").map { it.toInt() }
    var answer = 0
    for (i in 0 until n) {
        var tmp = true
        for (j in i downTo 0) {
            if (h[j] > h[i]) tmp = false
        }
        if (tmp) answer++
    }
    println(answer)
}
