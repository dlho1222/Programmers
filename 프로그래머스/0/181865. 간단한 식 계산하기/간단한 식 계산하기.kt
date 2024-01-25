class Solution {
        fun solution(binomial: String): Int {
            var answer: Int = 0
            val binomialList = binomial.split(" ")
            var operator = binomialList[1]
            answer = when (operator) {
                "+" -> binomialList[0].toInt() + binomialList[2].toInt()
                "-" -> binomialList[0].toInt() - binomialList[2].toInt()
                else -> binomialList[0].toInt() * binomialList[2].toInt()
            }
            return answer
        }
    }