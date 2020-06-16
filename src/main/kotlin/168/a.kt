fun main(args: Array<String>) {
    val hon = arrayOf(2,4,5,7,9)
    val pon = arrayOf(1,6,8,0)
    val bon = arrayOf(3)
    val n = readLine()!!.toInt() % 10
    if (hon.contains(n)) {
        println("hon")
    } else if (pon.contains(n)) {
        println("pon")
    } else println("bon")
}