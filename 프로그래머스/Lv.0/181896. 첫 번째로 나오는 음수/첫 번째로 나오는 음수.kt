class Solution {
        fun solution(num_list: IntArray): Int {
            var answer: Int = -1
            for (i in num_list.indices) {
                if (0 > num_list[i]) {
                    answer = i
                    break
                }
            }
            return answer
        }
    }