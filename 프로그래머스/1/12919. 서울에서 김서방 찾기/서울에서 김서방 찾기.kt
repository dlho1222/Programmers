class Solution {
        fun solution(seoul: Array<String>): String {
            var answer = "김서방은 ${seoul.indexOfFirst { it.equals("Kim") }}에 있다"
            
            print(answer)
            return answer
        }
    }