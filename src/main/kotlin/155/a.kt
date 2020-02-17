fun main(args: Array<String>) {
    val (a,b,c) = readLine()!!.split(" ")
    println(if ((a==b && b!=c && a!=c) || (a!=b && b!=c && a==c) || (a!=b && b==c && a!=c)) "Yes" else "No")
}