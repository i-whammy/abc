fun main(args: Array<String>) {
    val s = readLine()!!
    val sorted = s.toCharArray().sorted()
    println(if (sorted[0] == sorted[1] && sorted[2] == sorted[3] && sorted[0] != sorted[2]) "Yes" else "No")
}
