fun main(args: Array<String>) {
    var list = mutableListOf<Int>()
    for (i in 0 until 5) {
        list.add(readLine()!!.toInt())
    }
    val k = readLine()!!.toInt()
    list.sorted()
    println(if (Math.abs(list[0]-list[4]) > k) ":(" else "Yay!")
}
