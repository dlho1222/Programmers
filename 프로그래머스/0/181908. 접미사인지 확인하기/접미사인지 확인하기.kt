class Solution {
        fun solution(my_string: String, is_suffix: String): Int =
            if (my_string.indices.map { my_string.substring(it, my_string.length) }
                    .contains(is_suffix)) 1 else 0
    }