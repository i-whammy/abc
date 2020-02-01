fun main(args: Array<String>) {
    val s = readLine()!!
    println(2 * Math.min(s.filter { it == '0' }.count(), s.filter { it == '1' }.count()))
}
