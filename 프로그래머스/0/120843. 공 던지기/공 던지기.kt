class Solution {
        fun solution(numbers: IntArray, k: Int): Int = numbers[2 * (k - 1) % numbers.size]
    }