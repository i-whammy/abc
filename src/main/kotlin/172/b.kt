fun main(args: Array<String>) {
    val s = readLine()!!
    val t = readLine()!!
    var count = 0
    s.mapIndexed { index, c ->
        if (c != t[index]) count++
    }
    println(count)
}

