class Solution {
        fun solution(t: String, p: String): Int {
            var answer: Int = 0
            val Plength = p.length
            val Tlength = t.length
            val cnt = Tlength - (Plength - 1)
            for (i in 0 until cnt) {
                if (t.substring(0 + i, Plength + i).toLong() <= p.toLong()) answer++
            }
            return answer
        }
    }