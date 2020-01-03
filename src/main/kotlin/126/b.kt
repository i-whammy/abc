fun main(args: Array<String>) {
    val months = Regex("01|02|03|04|05|06|07|08|09|10|11|12")
    val (l,r) = readLine()!!.chunked(2)
    if (months.matches(l) && months.matches(r)) println("AMBIGUOUS")
    else if (months.matches(l)) println("MMYY")
    else if (months.matches(r)) println("YYMM")
    else println("NA")
}

fun String.chunked(num: Int)
        = (0 until this.length / num).map { this.substring(it * num, (it+1) * num) }