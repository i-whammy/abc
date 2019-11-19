fun main(args: Array<String>) {
    val s = readLine()!!
    for (i in 1..s.length) {
        if ((i % 2 == 1 && s[i-1] == 'L') || (i % 2 == 0 && s[i-1] == 'R')) {
            println("No")
            System.exit(0)
        }
    }
    println("Yes")
}