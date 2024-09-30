class Solution {
        fun solution(s: String): IntArray {
            val sortedList = s.substring(2, s.length - 2).split("},{")
                .map { it.split(",").map { it.toInt() }.toSet() }.sortedBy { it.size }
            val result = mutableListOf<Int>()
            for (set in sortedList) {
                result.addAll(set - result.toSet())
            }
            return result.toIntArray()
        }
    }