fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val maps = mutableMapOf<String, Long>()
    for (i in 0 until n) {
        val str = readLine()!!.toCharArray().sorted().toString()
        val num = maps[str] ?: 0
        maps[str] = num + 1
    }
    println(maps.values.fold(0L) { acc, l -> acc + (l * (l-1) / 2) })
}
