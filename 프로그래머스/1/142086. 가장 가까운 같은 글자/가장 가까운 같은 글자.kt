class Solution {
        fun solution(s: String): IntArray = s.withIndex()
            .map { (i, c) -> s.slice(0 until i).lastIndexOf(c).let { if (it >= 0) i - it else -1 } }
            .toIntArray()
    }