import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    for (i in 1..9) {
        if (a % i == 0 && a / i in 1..9) {
            println("Yes")
            System.exit(0)
        }
    }
    println("No")
}