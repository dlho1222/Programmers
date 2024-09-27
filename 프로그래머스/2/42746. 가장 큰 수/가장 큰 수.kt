class Solution {
        fun solution(numbers: IntArray): String =
            if (numbers.all { it == 0 }) "0" else numbers.map { it.toString() }
                .sortedWith { a, b -> (b + a).compareTo(a + b) }.joinToString("")
    }