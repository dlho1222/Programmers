class Solution {
        fun solution(my_string: String, m: Int, c: Int): String {
            var answer: String = ""
            for (i in c .. my_string.length step m) {
                answer += my_string[i - 1]
            }
            return answer
        }
    }