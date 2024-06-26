class Solution {
        fun solution(numLog: IntArray): String {
            var answer: String = ""
            for (i in 0..numLog.size) {
                if (i + 1 < numLog.size) {
                    when (numLog[i] - numLog[i + 1]) {
                        -1 -> answer += "w"
                        1 -> answer += "s"
                        -10 -> answer += "d"
                        10 -> answer += "a"
                    }
                }
            }
            return answer
        }
    }