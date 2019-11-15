import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    if (a in 1..9 && b in 1..9) println(a * b) else println(-1)
}