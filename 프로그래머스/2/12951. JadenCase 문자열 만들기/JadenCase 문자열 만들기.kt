class Solution {
    fun solution(s: String): String =
        s.split(" ").map { it.lowercase() }
                .joinToString(" ") { it.replaceFirstChar { char -> if (char.isLetter()) char.uppercaseChar() else char.lowercaseChar() } }
}