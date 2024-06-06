import kotlin.math.pow
import kotlin.math.sqrt
class Solution {
        fun solution(n: Long): Long =
            if (sqrt(n.toDouble()).toLong() * sqrt(n.toDouble()).toLong() == n.toDouble().toLong()) (sqrt(n.toDouble()) + 1).pow(
                2
            ).toLong() else -1
    }