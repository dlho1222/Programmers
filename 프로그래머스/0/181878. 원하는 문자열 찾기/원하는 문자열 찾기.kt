class Solution {
        fun solution(myString: String, pat: String): Int {
            var answer: Int = 0
            val newString = myString.toLowerCase()
            val newPat = pat.toLowerCase()
            if(newString.contains(newPat)) answer = 1 
            return answer
        }
    }