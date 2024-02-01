class Solution {
        fun solution(date1: IntArray, date2: IntArray) =
            if (date1.joinToString("").toInt() < date2.joinToString("").toInt()) 1 else 0
    }