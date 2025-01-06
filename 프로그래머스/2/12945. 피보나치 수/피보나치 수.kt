class Solution {
        fun solution(n: Int): Int = Array(n + 1) { 0 }.apply {
            this[0] = 0
            this[1] = 1
            for (i in 2..n) this[i] = (this[i - 1] + this[i - 2]) % 1234567
        }.last()
    }