class Solution {
        fun solution(my_string: String, n: Int): String {
            var answer: String = ""
            for (i in my_string.indices) {
                for (j in 0 until n) {
                    answer += my_string[i]
                }
            }
            return answer
        }
    }