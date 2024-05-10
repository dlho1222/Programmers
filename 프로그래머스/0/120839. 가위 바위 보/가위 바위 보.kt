class Solution {
        fun solution(rsp: String): String =
            rsp.map {
                when (it) {
                    '2' -> 0
                    '0' -> 5
                    '5' -> 2
                    else -> 0
                }
            }.joinToString("")
    }