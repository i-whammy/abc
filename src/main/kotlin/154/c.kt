fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val keys = readLine()!!.split(" ").sorted()
    for (i in 0 until n-1) {
        if (keys[i] == keys[i+1]) {
            return println("NO")
        }
    }
    println ("YES")
}
