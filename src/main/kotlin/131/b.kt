fun main(args: Array<String>) {
    val (n,l) = readLine()!!.split(" ").map { it.toInt() }
    val list = mutableListOf<Int>()
    var min = 300
    for (i in 0 until n) {
        val num = l + i
        list.add(num)
        if (min > Math.abs(num)) min = num
    }
    println(list.reduce { acc, i -> acc + i } - min)
}
