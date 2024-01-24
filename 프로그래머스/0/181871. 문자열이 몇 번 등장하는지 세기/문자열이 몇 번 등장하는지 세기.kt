class Solution {
        fun solution(myString: String, pat: String): Int {
            var count = 0
            for (i in myString.indices) {
                if (i <= myString.length - pat.length) {
                    if(myString.substring(i, pat.length + i) == pat) count++
                }
            }
            return count
        }
    }