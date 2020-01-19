fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val p = readLine()!!.split(" ").map { it.toInt() }
    var count = 1
    var max = p[0]
    for (i in 1 until n) {
        if (p[i] < max) {
            count++
            max = p[i]
        }
    }
    println(count)
}
