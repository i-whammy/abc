fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var ans = mutableListOf<Int>()
    ans.add((n / 1.08).toInt())
    ans.add(ans[0] + 1)
    ans.add(ans[1] + 1)
    for (i in 0 until 3) {
        if ((ans[i] * 1.08).toInt() == n) {
            println(ans[i])
            System.exit(0)
        }
    }
    println(":(")
}
