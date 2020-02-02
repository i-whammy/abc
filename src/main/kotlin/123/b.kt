fun main(args: Array<String>) {
    val tens = mutableListOf<Int>()
    val noTens = mutableListOf<Int>()
    var answer = 0
    for (i in 1..5) {
        val s = readLine()!!.toInt()
        if (s % 10 == 0) tens.add(s) else noTens.add(s)
    }
    noTens.sortBy { it % 10 }
    for (i in tens.indices) {
        answer += tens[i]
    }
    for (i in noTens.indices) {
        answer += if (i == 0) noTens[i] else round(noTens[i])
    }
    println(answer)
}

fun round(i : Int) = i + 10 - (i % 10)
