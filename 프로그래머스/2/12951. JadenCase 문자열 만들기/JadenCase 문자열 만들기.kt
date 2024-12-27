class Solution {
        fun solution(s: String): String = s.lowercase().split(" ")
            .joinToString(" ") { it.replaceFirstChar { char -> if (char.isLetter()) char.uppercaseChar() else char.lowercaseChar() } }
    }