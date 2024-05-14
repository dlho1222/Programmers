class Solution {
        fun solution(n: Int): Int {
            var count = 1
            while (true) {
                if ((count * 6) % n == 0) break else count++
            }
            return count
        }
    }