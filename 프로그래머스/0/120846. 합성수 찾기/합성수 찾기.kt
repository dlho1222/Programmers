class Solution {
        fun solution(n: Int): Int {
            var count = 0
            for (i in 1..n) {
                val measure = mutableListOf<Int>()
                for (j in 1..i) {
                    if (i % j == 0) measure.add(j)
                }
                if (measure.size >= 3) count++
            }
            return count
        }
    }