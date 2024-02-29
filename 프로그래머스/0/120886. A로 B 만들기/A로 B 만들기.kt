class Solution {
        fun solution(before: String, after: String): Int =
            if (before.toList().sorted().joinToString("") == after.toList().sorted()
                    .joinToString("")
            ) 1 else 0
    }