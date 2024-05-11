class Solution {
        fun solution(numbers: IntArray): Int =
            numbers.sortedDescending()[0] * numbers.sortedDescending()[1]
    }