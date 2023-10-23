import kotlin.math.sqrt 
class Solution {
        fun solution(n: Long): Long {
            var answer: Long = 0
            val x = sqrt(n.toDouble()).toLong()
            answer = if(x * x == n) ((x + 1) * (x+1)) else -1
            return answer
        }
    }