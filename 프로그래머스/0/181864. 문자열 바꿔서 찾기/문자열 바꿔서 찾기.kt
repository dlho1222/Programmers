class Solution {
        fun solution(myString: String, pat: String): Int {
            var answer: Int = 0
            var reverse = ""
            for (char in myString){
                if(char == 'A') reverse += "B" else reverse += "A"
            }
            if(reverse.contains(pat)) answer++
            return answer
        }
    }