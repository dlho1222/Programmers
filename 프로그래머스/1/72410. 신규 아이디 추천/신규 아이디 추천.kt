class Solution {
        fun solution(new_id: String): String =
            new_id.lowercase().replace("[^-_.a-z0-9]".toRegex(), "").replace("[.]+".toRegex(), ".")
            .trim('.').let { it.ifEmpty { "a" } }.take(15).trimEnd('.')
                .let { it.padEnd(3, it.last()) }
    }