class Solution {
        fun solution(sides: IntArray): Int {
            val maxLength = sides.maxOrNull()!!
            val minLength = sides.minOrNull()!!
            val max = maxLength + minLength - 1
            val min = maxLength - minLength + 1
            val sidesLength = (min .. max).toList()
            return sidesLength.size
        }
    }