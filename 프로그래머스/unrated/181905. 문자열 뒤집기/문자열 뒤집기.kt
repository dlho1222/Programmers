class Solution {
        fun solution(my_string: String, s: Int, e: Int): String {
           
            return my_string.replaceRange(s,e+1,my_string.substring(s,e+1).reversed())
        }
    }