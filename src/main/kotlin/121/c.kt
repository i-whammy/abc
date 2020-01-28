class ShopInformation(val unitPrice: Long, val limit: Long)

fun main(args: Array<String>) {
    val (n,m) = readLine()!!.split(" ").map { it.toInt() }
    val shops = Array(n) { readLine()!!.split(" ").map { it.toLong() }.let { ShopInformation(it.first(), it.last()) } }.sortedBy { it.unitPrice }
    var count = 0L
    var answer = 0L

    for (i in 0 until n) {
        answer += Math.min(shops[i].limit, m - count) * shops[i].unitPrice
        if (shops[i].limit >= m - count) break
        count += shops[i].limit
    }
    println(answer)
}
