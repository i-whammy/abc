fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var list = Array(n){0}
    for (i in 0 until n) {
        list[i] = readLine()!!.toInt()
    }
    val sorted = list.sorted()
    for (i in 0 until n) {
        if (list[i] == sorted[n-1]) println(sorted[n-2])
        else println(sorted[n-1])
    }
}
