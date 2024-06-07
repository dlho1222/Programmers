class Solution {
        fun solution(absolutes: IntArray, signs: BooleanArray): Int =
            absolutes.zip(signs.map { it }).sumOf { if (it.second) it.first else -it.first }
    }