fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val ds = readLine()!!.split(" ")
    var sum = ds.map { it.toInt() }.reduce { i1,i2 -> i1 + i2 }
    var ans = 0
    for (i in 0..n-1) {
        sum -= ds[i].toInt()
        ans += ds[i].toInt() * sum
    }
    println(ans)
}