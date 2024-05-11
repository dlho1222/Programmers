class Solution {
        fun solution(n: Int): Int {
            var answer: Int = 1
            var count = 0
            for (i in 1..n) {
                answer *= i
                if (answer > n) break
                count++
            }
            return count
        }
    }