class Solution {
        fun solution(my_string: String, n: Int): String {
            var answer: String = ""
            val totalLength = my_string.length - n
            for (i in totalLength..my_string.lastIndex){
                answer += my_string[i]
            }
            return answer
        }
    }