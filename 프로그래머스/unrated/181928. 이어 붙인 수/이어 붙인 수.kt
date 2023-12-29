class Solution {
        fun solution(num_list: IntArray): Int {
            var answer: Int = 0
            var odd = ""
            var even = ""
            for (i in num_list.indices) {
                if (num_list[i] % 2 != 0) {
                    odd += num_list[i]
                }
            }
            for (i in num_list.indices) {
                if (num_list[i] % 2 == 0) {
                    even += num_list[i]
                }
            }
            answer = odd.toInt() + even.toInt()
            
            return answer
        }
    }