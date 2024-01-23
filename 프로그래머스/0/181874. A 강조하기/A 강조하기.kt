class Solution {
        fun solution(myString: String): String=
            myString.mapIndexed { index, c -> if(c == 'a' || c == 'A') c.uppercase() else c.lowercase() }.joinToString("")
    }