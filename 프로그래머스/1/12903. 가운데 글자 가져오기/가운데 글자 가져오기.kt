class Solution {
        fun solution(s: String): String {
            var answer = ""
            var charArray = s.toCharArray().map { it.toString() }
            if(s.length % 2 == 0){
            answer = charArray[s.length/2-1] + charArray[s.length/2]

            }else{
            answer = charArray[s.length/2]
            }

            return answer
        }
    }