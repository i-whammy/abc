fun main(args: Array<String>) {
    val (k,n) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    var max = a[0] + (k-a[n-1])
    for (i in 0 until n-1) {
        if (a[i+1] - a[i] > max) max = a[i+1] - a[i]
    }
    println(k-max)
}
