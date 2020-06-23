fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val list = mutableListOf<String>()
    var count = 1
    repeat(n) {
        list.add(readLine()!!)
    }
    val sortedList = list.sorted()
    for (i in 1 until list.size) {
        if (sortedList[i-1] != sortedList[i]) count++
    }
    println(count)
}
