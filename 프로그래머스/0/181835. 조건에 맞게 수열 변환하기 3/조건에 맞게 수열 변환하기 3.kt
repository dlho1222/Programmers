class Solution {
        fun solution(arr: IntArray, k: Int): IntArray =
            arr.map { if (k % 2 != 0) it * k else it + k }.toIntArray()
    }