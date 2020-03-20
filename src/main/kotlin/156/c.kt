fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val points = readLine()!!.split(" ").map { it.toInt() }
    var answer = Double.MAX_VALUE
    for (i in points.min()!!..points.max()!!) {
        var candidate = 0.0
        for (j in 0 until n) {
            candidate += Math.pow(points[j]-i.toDouble(), 2.0)
        }
        answer = Math.min(candidate, answer)
    }
    println(answer.toInt())
}
