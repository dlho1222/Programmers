import kotlin.math.sqrt
class Solution {
        fun solution(n: Int): Int {
            val sqrt = sqrt(n.toDouble()).toInt()
            return if(sqrt * sqrt == n) 1 else 2
        }
    }