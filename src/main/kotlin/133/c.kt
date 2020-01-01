fun main(args: Array<String>) {
    val (l,r) = readLine()!!.split(" ").map { it.toLong() }
    if (r - l >= 2018) return println(0)
    var mod = 2018
    for (i in l until r) {
        for (j in l+1..r) {
            if (mod > i * j % 2019) mod = i.times(j).rem(2019).toInt()
            if (mod == 0) return println(0)
        }
    }
    println(mod)
}