class Solution {
        fun solution(num_list: IntArray): Int {
            var answer: Int = -1
            answer = num_list.indexOfFirst { it < 0 }
            return answer
        }
    }