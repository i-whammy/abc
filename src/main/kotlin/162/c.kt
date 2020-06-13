fun main(args: Array<String>) {
    val k = readLine()!!.toInt()
    var sum = 0L
    for (i in 1..k) {
        for (j in 1..k) {
            for (h in 1..k) {
                sum += euc(euc(i,j), h)
            }
        }
    }
    println(sum)
}

fun euc(a: Int, b: Int) : Int {
    var tmp1 = Math.max(a,b)
    var tmp2 = Math.min(a,b)
    while (tmp1 % tmp2 != 0) {
        val tmp3 = tmp2
        tmp2 = tmp1 % tmp3
        tmp1 = tmp3
    }
    return tmp2
}

