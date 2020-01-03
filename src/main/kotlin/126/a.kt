fun main(args: Array<String>) {
    val (n,k) = readLine()!!.split(" ").map { it.toInt() }
    var s = readLine()!!.toCharArray()
    s[k-1] = s[k-1].toLowerCase()
    println(s.joinToString(""))
}
