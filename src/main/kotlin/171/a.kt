fun main(args: Array<String>) {
    val s = readLine()!!
    println(if (Regex("[A-Z]").matches(s)) "A" else "a")
}