class Solution {
        fun solution(n: Int): Int = Array(n + 1) { if (it < 2) it else 0 }.apply {
            for (i in 2..n) this[i] = (this[i - 2] + this[i - 1]) % 1234567
        }[n]
    }