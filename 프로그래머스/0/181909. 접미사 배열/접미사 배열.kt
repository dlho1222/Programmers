class Solution {
        fun solution(my_string: String): Array<String> =
            my_string.indices.map { my_string.substring(it, my_string.length) }.sorted()
                .toTypedArray()
    }