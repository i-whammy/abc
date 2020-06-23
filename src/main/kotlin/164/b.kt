fun main(args: Array<String>) {
    var (a,b,c,d) = readLine()!!.split(" ").map { it.toInt() }
    repeat(100) {
        c -= b
        if (c <= 0) return println("Yes")
        a -= d
        if (a <= 0) return println("No")
    }
}