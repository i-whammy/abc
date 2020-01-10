fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    var count = 0
    for (i in 0 until n-2) {
        if (s[i] == 'A' && s[i+1] == 'B' && s[i+2] == 'C') count++
    }
    println(count)
}