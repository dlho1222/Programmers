class Solution {
        fun solution(n: Int): IntArray {
            var answer: IntArray = intArrayOf()
            var result = n
            answer += result
            while (result > 1) {
                if (result % 2 == 0) result /= 2 else result = (result * 3) + 1
                answer += result
            }
         
            return answer
        }
    }