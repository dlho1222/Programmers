import kotlin.math.abs
class Solution {
        fun solution(array: IntArray, n: Int): Int {
            val diff = array.sorted().map { minOf(abs(it - n)) }
            val minValue = diff.minOrNull()
            val idx = diff.indexOf(minValue)
            return array.sorted()[idx]
        }
    }