class Solution {
        fun solution(k: Int, tangerine: IntArray): Int {
            val tangerineGroup = tangerine.groupBy { it }
            val sortedTangerine = tangerineGroup.values.sortedByDescending { it.count() }
            var count = 0
            var selected = 0
            for (select in sortedTangerine) {
                count++
                selected += select.size
                if (selected >= k) break
            }
            return count
        }
    }