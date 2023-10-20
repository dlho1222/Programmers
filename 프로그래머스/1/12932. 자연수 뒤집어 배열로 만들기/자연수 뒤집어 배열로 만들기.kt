class Solution {
        fun solution(n: Long): IntArray = n.toString().toList().map { it.toString().toInt() }.reversed().toIntArray()
    }