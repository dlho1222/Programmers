 class Solution {
        fun solution(x: Int): Boolean {
            var answer = true
            val digit =  x.toString().toCharArray().map { it.toString().toInt() }
            val count = digit.size
            var result = 0

            for(i in 0 until count) {
                result += digit[i]
                answer = if(x%result == 0) true else false
            }
            return answer
        }
    }