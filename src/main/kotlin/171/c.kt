fun main(args: Array<String>) {
    val n = readLine()!!.toLong()
    var answer = ""
    val alphabets = arrayOf("a", "b", "c", "d", "e", "f", "g", "h", "i" , "j", "k", "l", "m","n", "o","p","q","r","s","t","u","v","w","x","y","z")
    loop@ for (i in 10 downTo 0) {
        var tmp = n-1
        for (j in 0 until i) {
            tmp /= 26
            if (tmp <= 0L) {
                continue@loop
            }
            tmp -= 1
        }
        answer += alphabets[(tmp%26).toInt()]
    }
    println(answer)
}
