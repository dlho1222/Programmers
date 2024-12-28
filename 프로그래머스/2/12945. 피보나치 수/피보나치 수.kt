class Solution {
        fun solution(n: Int): Int = mutableListOf(0, 1).apply {
            for (i in 2..n) {
                add((this[i - 1] + this[i - 2]) % 1234567)
            }
        }.last()
    }