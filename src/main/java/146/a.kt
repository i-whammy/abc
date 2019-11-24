import java.io.PrintWriter

fun main(args: Array<String>) {
    val ss = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
    val s = readLine()!!
    println(7 - ss.indexOf(s))
}