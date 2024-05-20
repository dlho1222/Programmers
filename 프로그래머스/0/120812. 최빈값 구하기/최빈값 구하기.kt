class Solution {
        fun solution(array: IntArray): Int =
            if (array.groupBy { it }.size > 1 && array.groupBy { it }.entries.maxByOrNull { it.value.size }!!.value.size == array.groupBy { it }.entries.sortedByDescending { it.value.size }[1].value.size) -1 else array.groupBy { it }.entries.maxByOrNull { it.value.size }!!.key
    }