class Solution {
        fun solution(sizes: Array<IntArray>): Int {
            var answer: Int = 0
            var height = 0
            var width = 0
            height = sizes.maxOfOrNull { maxOf(it[0], it[1]) }!!
            width = sizes.maxOfOrNull { minOf(height, it[0], it[1]) }!!
            return height * width
        }
    }