fun main(args: Array<String>) {
    val h = readLine()!!.toLong()
    println(fight(h,1L))
}

fun fight(hitPoint: Long, count: Long) : Long = if (hitPoint == 1L) count
else fight(hitPoint/2, count * 2 + 1)