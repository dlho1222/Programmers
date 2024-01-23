class Solution {
        fun solution(myString: String, pat: String): String {
            var idx = myString.lastIndexOf(pat)
            return myString.substring(0,idx) + pat 
        }
    }