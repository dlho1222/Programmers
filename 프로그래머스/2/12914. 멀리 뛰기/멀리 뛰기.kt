class Solution {
        fun solution(n: Int): Long {
            if (n == 1) return 1
            if (n == 2) return 2
            var prev1 = 1
            var prev2 = 2
            var current = 0
            for (i in 3..n) {
                current = (prev1 + prev2) % 1234567
                prev1 = prev2
                prev2 = current
            }
            return current.toLong()
        }
    }