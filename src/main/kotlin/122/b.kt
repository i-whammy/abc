fun main(args: Array<String>) {
    val s = readLine()!!
    var count = 0
    var answer = 0
    for (i in s.indices) {
        if (Regex("A|C|T|G").matches(s[i].toString())) {
            count++
        } else {
            if (answer < count) answer = count
            count = 0
        }
        if (i == s.length - 1) if (answer < count) answer = count
    }
    println(answer)
}
