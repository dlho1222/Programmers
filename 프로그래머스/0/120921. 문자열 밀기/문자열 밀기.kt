class Solution {
        fun solution(A: String, B: String): Int {
            if (A == B) return 0
            val lastIdx = A.length - 1
            var shift = A
            for (i in 1..A.length) {
                shift = shift.last() + shift.substring(0, lastIdx)
                if (shift == B) return i
            }
            return -1
        }
    }