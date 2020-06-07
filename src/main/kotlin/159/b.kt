fun main(args: Array<String>) {
    val s = readLine()!!
    if (!isPalindrome(s)) {
        return println("No")
    } else if (isPartlyPalindrome(s)) {
        return println("No")
    } else if (isLatterPartlyPalindrome(s)) {
        return println("No")
    }
    println("Yes")
}

fun isPalindrome(string: String): Boolean {
    for (i in 0 until string.length / 2) {
        if (string[i] != string[string.length - 1 - i]) return false
    }
    return true
}

fun isPartlyPalindrome(string: String): Boolean {
    return isPalindrome(string.substring(0, (string.length - 1) / 2))
}

fun isLatterPartlyPalindrome(string: String): Boolean {
    return isPalindrome(string.substring((string.length + 3) / 2 - 1, string.length))
}