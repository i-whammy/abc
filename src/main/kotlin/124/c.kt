fun main(args: Array<String>) {
    val s = readLine()!!.withIndex()
    var patternA = s.filter {(it.index % 2 == 0 && it.value == '0') || (it.index % 2 == 1 && it.value == '1')}.size
    var patternB = s.filter {(it.index % 2 == 1 && it.value == '0') || (it.index % 2 == 0 && it.value == '1')}.size
    println(Math.min(patternA, patternB))
}
