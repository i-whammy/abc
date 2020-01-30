fun main(args: Array<String>) {
    val (a,b,k) = readLine()!!.split(" ").map { it.toInt() }
    val list = mutableListOf<Int>()
    for (i in 1..Math.min(a,b)) {
        if (a % i == 0 && b % i == 0) list.add(i)
    }
    println(list[list.size - k])
}

