class Solution {
        fun solution(numbers: IntArray): String {
            val strNum = numbers.map { it.toString() }
            val sortedNum = strNum.sortedWith { a, b -> (b + a).compareTo(a + b) }
            val result = sortedNum.joinToString("")
            return if (result.startsWith("0")) "0" else result
        }
    }