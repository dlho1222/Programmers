class Solution {
        fun solution(my_string: String, is_prefix: String): Int =
            if (my_string.indices.map { my_string.slice(0..it) }.contains(is_prefix)) 1 else 0
    }