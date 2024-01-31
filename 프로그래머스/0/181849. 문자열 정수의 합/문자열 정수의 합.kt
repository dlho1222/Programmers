class Solution {
        fun solution(num_str: String): Int {
            var answer: Int = 0
            num_str.forEach { answer+=it.toString().toInt() }
            return answer
        }
    }