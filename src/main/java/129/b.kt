fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!.split(" ").map { it.toInt() }
    val total = s.reduce {a, b -> a + b }
    var min = total
    for (i in 0 until n) {
        val first = s.subList(0,i+1).reduce{a,b -> a+b}
        if (min > Math.abs((total - first) - first)) min = Math.abs((total - first) - first)
    }
    println(min)
}
