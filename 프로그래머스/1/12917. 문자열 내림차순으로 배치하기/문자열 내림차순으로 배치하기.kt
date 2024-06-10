class Solution {
        fun solution(s: String): String = s.map { it }.sortedDescending().joinToString("")
    }