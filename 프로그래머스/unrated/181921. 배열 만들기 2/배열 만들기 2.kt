class Solution {
        fun solution(l: Int, r: Int): IntArray {
            var answer: IntArray = intArrayOf()
            answer += (l..r).filter { it.toString().all { char -> char == '0' || char == '5' } }
            if (answer.isEmpty()) answer += -1
            return answer
        }
    }