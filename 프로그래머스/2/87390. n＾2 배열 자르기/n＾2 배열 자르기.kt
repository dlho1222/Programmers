class Solution {
        fun solution(n: Int, left: Long, right: Long): IntArray {
            var answer: IntArray = IntArray((right - left).toInt() + 1)
            for (i in left..right) {
                val row = (i / n).toInt()
                val col = (i % n).toInt()
                answer[(i - left).toInt()] = maxOf(row, col) + 1
            }
            return answer
        }
    }