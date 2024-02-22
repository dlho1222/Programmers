class Solution {
        fun solution(my_string: String): String {
            var answer: String = ""
            my_string.forEach {
                answer += if (it.isUpperCase()) it.lowercase() else it.uppercase()
            }
            return answer
        }
    }