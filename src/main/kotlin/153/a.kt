fun main(args: Array<String>) {
    val (h,a) = readLine()!!.split(" ").map { it.toInt() }
    println(if (h%a==0) h/a else h/a + 1)
}