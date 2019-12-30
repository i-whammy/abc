fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!
    if (n % 2 != 0) exitNo()
    for (i in 0 until n/2) {
        if (s[i] != s[i + n/2]) exitNo()
    }
    exitYes()
}

private fun exitYes() {
    println("Yes")
    System.exit(0)
}

private fun exitNo() {
    println("No")
    System.exit(0)
}