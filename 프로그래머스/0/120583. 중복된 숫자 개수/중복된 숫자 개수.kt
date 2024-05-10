class Solution {
        fun solution(array: IntArray, n: Int): Int = array.map { it == n }.filter { it }.count()
    }