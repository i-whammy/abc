fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    println(getSumOfArithmeticSequence(1,n,n) - getSumOfArithmeticSequence(3,n/3*3,n/3) - getSumOfArithmeticSequence(5,n/5*5,n/5) + getSumOfArithmeticSequence(15,n/15*15, n/15))
}

private fun getSumOfArithmeticSequence(beginning: Int, ending: Int, length: Int) : Long = (beginning + ending) * length.toLong() / 2