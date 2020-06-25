fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val numbers = Array(1000000) { 0L }
    val input = readLine()!!.split(" ").map { it.toLong() }
    input.forEach { numbers[it.toInt()]++ }
    var sum = input.sum()
    val q = readLine()!!.toInt()
    repeat(q) {
        val (b,c) = readLine()!!.split(" ").map { it.toLong() }
        val numberB = numbers[b.toInt()]
        sum += (c-b) * numberB
        println(sum)
        numbers[c.toInt()] += numberB
        numbers[b.toInt()] = 0L
    }
}
