fun main(args: Array<String>) {
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toLong() }
    val common = c * d / euclid(c,d)
    println(b - b/c - b/d + b / common - (a-1) + (a-1)/c + (a-1)/d - (a-1) / common)
}

fun euclid(a: Long, b: Long):Long {
    var divisor = b
    var dividend = a
    var remainder = b % a
    while (remainder != 0L) {
        divisor = dividend
        dividend = remainder
        remainder = divisor % dividend
    }
    return dividend
}