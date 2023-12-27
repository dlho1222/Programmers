class Solution {
        fun solution(str1: String, str2: String): String {
            var answer: String = ""
            var i = 0
            while(str1.length > i ){
                answer += str1[i]
                answer += str2[i]
                i++
            }
            return answer
        }
    }