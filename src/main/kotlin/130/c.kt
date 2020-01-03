fun main(args: Array<String>) {
    val (w,h,x,y) = readLine()!!.split(" ").map { it.toDouble() }
    val isHalf = w / x == 2.0 && h / y == 2.0
    val area = w * h / 2

    println(area.toString() + " " + if (isHalf) 1 else 0)
}
