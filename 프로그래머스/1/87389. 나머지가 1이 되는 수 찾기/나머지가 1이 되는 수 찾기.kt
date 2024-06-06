class Solution {
        fun solution(n: Int): Int = (2 until n).find { n % it == 1 } ?: 0
    }