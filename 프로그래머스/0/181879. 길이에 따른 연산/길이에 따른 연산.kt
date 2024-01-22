class Solution {
        fun solution(num_list: IntArray): Int {
            var answer: Int = 0
            if(num_list.size <= 10) answer = 1
            for (i in num_list.indices) {
                if (num_list.size >= 11) answer += num_list[i] else answer *= num_list[i]
            }
            return answer
        }
    }