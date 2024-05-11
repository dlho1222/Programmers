class Solution {
        fun solution(my_string: String): String =
            my_string.replace("a".toRegex(), "").replace("e".toRegex(), "")
                .replace("i".toRegex(), "").replace("o".toRegex(), "").replace("u".toRegex(), "")
    }