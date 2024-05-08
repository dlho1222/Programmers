import kotlin.math.abs
class Solution {
        fun solution(dots: Array<IntArray>): Int =
            abs(dots.minOf { it[0] } - dots.maxOf { it[0] }) * abs(dots.minOf { it[1] } - dots.maxOf { it[1] })
    }