class Solution {
        fun solution(s: String): String =
            s.split(" ").map { it.toInt() }.sorted().let { "${it.minOrNull()} ${it.maxOrNull()}" }
    }