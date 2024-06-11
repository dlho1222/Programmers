class Solution {
    fun solution(s: String): String = s.split(" ")
                    .map { it.mapIndexed { index, c -> if (index % 2 == 0) c.uppercaseChar() else c.lowercaseChar() } }
                    .joinToString(" ") { it.joinToString("") }
}