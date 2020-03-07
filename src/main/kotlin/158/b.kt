import java.lang.Math

fun main(args: Array<String>) {
    val (n,a,b) = readLine()!!.split(" ").map { it.toInt() }
    println(n / (a + b) * a + Math.min(a, n % (a + b)))
}