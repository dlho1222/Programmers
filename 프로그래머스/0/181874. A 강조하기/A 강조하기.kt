class Solution {
        fun solution(myString: String): String =
            myString.map { it -> if (it == 'a' || it == 'A') it.uppercase() else it.lowercase() }
                .joinToString("")
    }