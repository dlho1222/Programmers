 class Solution {
        fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
            var answer: IntArray = intArrayOf()
            var left = listOf<Int>()
            var right = listOf<Int>()
            left = arr.slice(intervals[0][0]..intervals[0][1])
            right = arr.slice(intervals[1][0]..intervals[1][1])
            answer += left + right
            return answer
        }
    }