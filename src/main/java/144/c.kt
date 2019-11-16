 import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = Math.floor(Math.sqrt(a.toDouble())).toInt()
    var ans = a
    for (i in 1..b) {
        if (a % i == 0L && i + a / i - 2 < ans) ans = i + a / i - 2
    }
    println(ans)
}