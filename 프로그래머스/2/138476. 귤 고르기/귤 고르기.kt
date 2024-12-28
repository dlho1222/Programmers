class Solution {
        fun solution(k: Int, tangerine: IntArray): Int =
            tangerine.groupBy { it }.values.sortedBy { it.count() }.flatten().takeLast(k)
                .toSet().size
    }