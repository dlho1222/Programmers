class Solution {
        fun solution(array: IntArray): IntArray {
            var answer: IntArray = intArrayOf()
            val max = array.maxOrNull()
            val idx = array.indexOf(max!!)
            answer += max
            answer += idx
            return answer
        }
    }