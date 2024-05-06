class Solution {
        fun solution(numbers: IntArray): Int =
            numbers.sorted().let { maxOf(it[0] * it[1], it[it.lastIndex - 1] * it.last()) }
    }