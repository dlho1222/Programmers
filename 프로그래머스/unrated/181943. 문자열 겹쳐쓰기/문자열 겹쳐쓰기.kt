class Solution {
        fun solution(my_string: String, overwrite_string: String, s: Int): String {
            var answer: String = ""
            var end = overwrite_string.length
            answer = my_string.replaceRange(s, end + s, overwrite_string)
            return answer
        }
    }