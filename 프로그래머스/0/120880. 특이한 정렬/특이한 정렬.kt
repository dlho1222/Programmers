import kotlin.math.abs
class Solution {
        fun solution(numlist: IntArray, n: Int): IntArray =
            numlist.sortedWith(compareBy<Int> { abs(n - it) }.thenByDescending { it }).toIntArray()
    }