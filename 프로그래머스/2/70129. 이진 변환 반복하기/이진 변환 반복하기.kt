class Solution {
        fun solution(s: String): IntArray {
            var zeroCnt = 0
            var conversionCnt = 0
            var current = s
            while (current != "1") {
                val zeros = current.count { it == '0' }
                zeroCnt += zeros
                current = current.filter { it == '1' }.length.toString(2)
                conversionCnt++
            }
            return intArrayOf(conversionCnt, zeroCnt)
        }
    }