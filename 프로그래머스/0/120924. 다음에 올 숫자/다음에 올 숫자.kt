class Solution {
        fun solution(common: IntArray): Int {
            val n = common.size
            val diff = common[1] - common[0]
            return if (diff == 0 || (common[1] - common[0]) == (common[2] - common[1])) {
                common[n - 1] + diff
            } else {
                val ratio = common[1] / common[0]
                common[n - 1] * ratio
            }
        }
    }