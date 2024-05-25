class Solution {
        fun solution(lines: Array<IntArray>): Int {
            val point = IntArray(201) { 0 }
            lines.forEach {
                for (i in it[0] until it[1]) {
                    point[i + 100]++
                }
            }
            return point.count { it >= 2 }
        }
    }