fun main(args: Array<String>) {
    var x = readLine()!!.toInt()
    while (true) {
        var flag = false
        for (i in 2 .. Math.sqrt(x.toDouble()).toInt()) {
            if (x % i == 0) {
                flag = true
                continue
            }
        }
        if (!flag) {
            return println(x)
        } else {
            x++
        }
    }
}