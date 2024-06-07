class Solution {
        fun solution(arr: IntArray, divisor: Int): IntArray =
            if (arr.none { it % divisor == 0 }) intArrayOf(-1) else arr.filter { it % divisor == 0 }
                .sorted().toIntArray()
    }