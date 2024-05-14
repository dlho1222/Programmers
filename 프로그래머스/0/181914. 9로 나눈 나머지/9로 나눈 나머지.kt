class Solution {
        fun solution(number: String): Int {
            var answer: Int = 0
            number.forEach {
                answer += it.digitToInt()
            }
        
            return answer % 9
        }
    }