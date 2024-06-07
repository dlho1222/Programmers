class Solution {
        fun solution(arr: IntArray): IntArray =
            if (arr.none { it != arr.minOrNull() }) intArrayOf(-1) else arr.filter { it != arr.minOrNull() }.toIntArray()
    }