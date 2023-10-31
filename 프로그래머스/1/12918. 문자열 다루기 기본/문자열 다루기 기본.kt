class Solution {
        fun solution(s: String): Boolean {
            var answer = false
            if (s.length == 4 || s.length == 6) {
                answer = s.all { it.isDigit() }
            }
           
            return answer
        }
    }