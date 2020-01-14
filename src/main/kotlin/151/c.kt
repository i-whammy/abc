class Result(val problem: String, val isAC: Boolean)

fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    var ac = 0
    var wa = 0
    val results = Array(m) {
        readLine()!!.split(" ").let { Result(it.first(), it.last() == "AC") }
    }.groupBy { it.problem }.map {
        var s = 0
        var f = 0
        for (i in it.value.indices) {
            if (it.value[i].isAC) {
                s++
                break
            } else {
                f++
            }
        }
        ac += s
        if (s > 0) wa += f
    }
    println("$ac $wa")
}
