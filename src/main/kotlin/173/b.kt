fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val map = mutableMapOf<String, Int>()
    map["AC"] = 0
    map["WA"] = 0
    map["TLE"] = 0
    map["RE"] = 0
    repeat(n) {
        val s = readLine()!!
        val v = map[s]!!
        map[s] = v+1
    }
    println("AC x ${map["AC"]}")
    println("WA x ${map["WA"]}")
    println("TLE x ${map["TLE"]}")
    println("RE x ${map["RE"]}")
}

