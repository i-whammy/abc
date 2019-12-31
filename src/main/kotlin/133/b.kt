fun main(args: Array<String>) {
    val (n,d) = readLine()!!.split(" ").map { it.toInt() }
    val list = mutableListOf<List<Double>>()
    for (i in 0 until n) {
        list.add(readLine()!!.split(" ").map { it.toDouble() })
    }
    var cnt = 0
    for (i in 0 until n) {
        for (j in i+1 until n) {
            var tmp = 0.0
            for (k in 0 until d) {
                tmp += Math.pow(list[j][k] - list[i][k], 2.0)
            }
            if (Math.sqrt(tmp) % 1 == 0.0) cnt++
        }
    }
    println(cnt)
}