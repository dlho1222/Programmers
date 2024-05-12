class Solution {
        fun solution(num_list: IntArray, n: Int): Array<IntArray> =
            num_list.toList().chunked(n).map { it.toIntArray() }.toTypedArray()
    }