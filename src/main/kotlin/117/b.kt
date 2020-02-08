fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val numbers = readLine()!!.split(" ").map { it.toInt() }
    val sum = numbers.reduce{ a,b -> a + b}
    numbers.forEach {
        if (it >= sum - it) {
            return println("No")
        }
    }
    println("Yes")
}
