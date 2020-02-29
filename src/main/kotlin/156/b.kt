fun main(args: Array<String>) {
    val (a,b) = readLine()!!.split(" ").map { it.toInt() }
    var digits = 1
    var remA = a
    while (remA >= b) {
        remA /= b
        digits++
    }
    println(digits)
}