class Solution {
        fun solution(n: Long): Long =
            n.toString().toList().sortedDescending().joinToString("").toLong()
    }