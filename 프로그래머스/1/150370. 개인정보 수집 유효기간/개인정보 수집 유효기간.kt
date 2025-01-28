class Solution {
        fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
            var answer: IntArray = intArrayOf()
            val (year, month, day) = today.split(".").map { it.toInt() }
            val todayTotal = (year * 12 * 28) + (month * 28) + day
            val termMap = terms.associate { it.split(" ")[0] to it.split(" ")[1] }

            privacies.forEachIndexed { index, privacy ->
                val (date, type) = privacy.split(" ")
                val (year, month, day) = date.split(".").map { it.toInt() }

                val privacyTotal =
                    (year * 12 * 28) + (month * 28) + day

                val expirationTotal = privacyTotal + (termMap[type]?.toInt() ?: 0) * 28
                if (todayTotal >= expirationTotal) {
                    answer += index + 1
                }
            }
            return answer
        }
    }