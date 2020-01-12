fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val p = readLine()!!.split(" ").map { it.toInt() }
    val q = readLine()!!.split(" ").map { it.toInt() }

    println(Math.abs(calculateIndex(p) - calculateIndex(q)))
}

private fun calculateIndex(numberArray: List<Int>): Int {
    val n = numberArray.size
    val array = IntArray(n) {it+1}.toMutableList()
    var index = 0
    for (i in 0 until n) {
        index += array.indexOf(numberArray[i]) * (factorial(numberArray.size - i - 1))
        array.remove(numberArray[i])
    }
    return index
}

private fun factorial(number: Int): Int {
    var ans = 1
    for (i in number downTo 1) {
        ans *= i
    }
    return ans
}