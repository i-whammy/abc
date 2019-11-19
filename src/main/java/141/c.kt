fun main(args: Array<String>) {
    val (persons, points, quizzes) = readLine()!!.split(" ").map { it.toInt() }
    val scores = Array(persons) { points - quizzes }
    for (i in 0 until quizzes) {
        scores[readLine()!!.toInt() - 1]++
    }
    for (i in 0 until persons) {
        if (scores[i] > 0) println("Yes")
        else println("No")
    }
}