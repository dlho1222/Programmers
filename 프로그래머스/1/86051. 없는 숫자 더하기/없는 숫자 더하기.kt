class Solution {
        fun solution(numbers: IntArray): Int = (0..9).filter { it !in numbers }.sum()
    }