class Solution {
        fun solution(dots: Array<IntArray>): Int {
            return if (slope(dots[0], dots[1]) == slope(dots[2], dots[3]) ||
                slope(dots[0], dots[2]) == slope(dots[1], dots[3]) ||
                slope(dots[0], dots[3]) == slope(dots[1], dots[2])
            ) 1 else 0
        }

        fun slope(dots1: IntArray, dots2: IntArray): Double {
            return (dots1[1] - dots2[1]).toDouble() / (dots1[0] - dots2[0]).toDouble()
        }
    }