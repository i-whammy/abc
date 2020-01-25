fun main(args: Array<String>) {
    val (H,W) = readLine()!!.split(" ").map { it.toInt() }
    val (h,w) = readLine()!!.split(" ").map { it.toInt() }
    println(H*W - (H*w + (W-w) * h))
}
