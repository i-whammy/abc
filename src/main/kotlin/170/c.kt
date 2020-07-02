fun main(args: Array<String>) {
    val x = readLine()!!.split(" ").map { it.toInt() }
    val x2 = x.first()
    val line = readLine()
    if (line.isNullOrBlank()) {
        return println(x2)
    }
    val p = line!!.split(" ").map { it.toInt() }
    for (i in 0..Int.MAX_VALUE)
        if (!p.contains(x2 - i)) {
            return println(x2 - i)
        } else if (!p.contains(x2 + i)) {
            return println(x2 + i)
        }
}

