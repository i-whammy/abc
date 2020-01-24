fun main(args: Array<String>) {
    val b = readLine()!!
    println(
            when (b) {
                "A" -> "T"
                "T" -> "A"
                "C" -> "G"
                else -> "C"
            }
    )
}
