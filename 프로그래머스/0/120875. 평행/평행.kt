class Solution {
        fun solution(dots: Array<IntArray>): Int {
            return if (slope(dots[0], dots[1]) == slope(dots[2], dots[3]) ||
                slope(dots[0], dots[2]) == slope(dots[1], dots[3]) ||
                slope(dots[0], dots[3]) == slope(dots[1], dots[2])
            ) 1 else 0
        }

        fun slope(p0: IntArray, p1: IntArray): Double {
            return (p0[1] - p1[1]).toDouble() / (p0[0] - p1[0]).toDouble()
        }

    }