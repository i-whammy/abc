fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val nums = readLine()!!.split(" ").map { it.toInt() }
    for (i in 0 until n) {
        val num = nums[i]
        if (num % 2 == 0 && (num % 3 != 0 && num % 5 != 0)) {
            return println("DENIED")
        }
    }
    println("APPROVED")
}