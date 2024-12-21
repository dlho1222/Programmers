class Solution {
        fun solution(s: String): IntArray =
            s.substring(2, s.length - 2).split("},{")
                .map { it.split(",").map { it.toInt() }.toSet() }.sortedBy { it.count() }.fold(
                    listOf<Int>()
                ) { acc, set -> acc + (set - acc) }.toIntArray()
    }