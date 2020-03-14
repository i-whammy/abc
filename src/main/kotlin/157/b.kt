fun main(args: Array<String>) {
    val row1 = mutableListOf<Int>()
    val row2 = mutableListOf<Int>()
    val row3 = mutableListOf<Int>()
    val bingo1 = mutableListOf(0,0,0)
    val bingo2 = mutableListOf(0,0,0)
    val bingo3 = mutableListOf(0,0,0)

    readLine()!!.split(" ").forEach { row1.add(it.toInt()) }
    readLine()!!.split(" ").forEach { row2.add(it.toInt()) }
    readLine()!!.split(" ").forEach { row3.add(it.toInt()) }

    val n = readLine()!!.toInt()
    for (i in 0 until n) {
        val b = readLine()!!.toInt()
        if (row1.contains(b)) bingo1[row1.indexOf(b)] = 1
        if (row2.contains(b)) bingo2[row2.indexOf(b)] = 1
        if (row3.contains(b)) bingo3[row3.indexOf(b)] = 1
    }

    if (!bingo1.contains(0) || !bingo2.contains(0) || !bingo3.contains(0)
            || (bingo1[0] == 1 && bingo2[0] == 1 && bingo3[0] == 1)
            || (bingo1[1] == 1 && bingo2[1] == 1 && bingo3[1] == 1)
            || (bingo1[2] == 1 && bingo2[2] == 1 && bingo3[2] == 1)
            || (bingo1[0] == 1 && bingo2[1] == 1 && bingo3[2] == 1)
            || (bingo1[2] == 1 && bingo2[1] == 1 && bingo3[0] == 1)) println("Yes")
    else println("No")
}