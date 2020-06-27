fun main(args: Array<String>) {
    val row1 = mutableListOf<String>()
    val row2 = mutableListOf<String>()
    val row3 = mutableListOf<String>()
    val result1 = MutableList(3) { false }
    val result2 = MutableList(3) { false }
    val result3 = MutableList(3) { false }
    readLine()!!.split(" ").map { row1.add(it) }
    readLine()!!.split(" ").map { row2.add(it) }
    readLine()!!.split(" ").map { row3.add(it) }
    val n = readLine()!!.toInt()
    repeat(n) {
        val s = readLine()!!
        if (row1.contains(s)) result1[row1.indexOf(s)] = true
        if (row2.contains(s)) result2[row2.indexOf(s)] = true
        if (row3.contains(s)) result3[row3.indexOf(s)] = true
    }
    if (result1.all { it }
            || result2.all { it }
            || result3.all { it }
            || (result1[0] and result2[0] and result3[0])
            || (result1[1] and result2[1] and result3[1])
            || (result1[2] and result2[2] and result3[2])
            || (result1[0] and result2[1] and result3[2])
            || (result1[2] and result2[1] and result3[0])
    ) println("Yes")
    else println("No")
}