fun main(args: Array<String>) {
    var ans = mutableListOf(1,2,3)
    ans.remove(readLine()!!.toInt())
    ans.remove(readLine()!!.toInt())
    println(ans[0])
}