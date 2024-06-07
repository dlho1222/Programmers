class Solution {
        fun solution(s: String): String =
            if (s.length % 2 == 0) s.slice(s.length / 2 - 1..s.length / 2) else s.slice(s.length / 2..s.length / 2)
    }