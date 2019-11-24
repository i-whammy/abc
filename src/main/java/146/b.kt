fun main(args: Array<String>) {
    val alphabets = arrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z')
    val n = readLine()!!.toInt()
    val s = readLine()!!
    var ans = CharArray(s.length)
    for (i in 0 until s.length) {
        val index = alphabets.indexOf(s[i])
        ans[i] = alphabets[(index + n) % 26]
    }
    println(String(ans))
}