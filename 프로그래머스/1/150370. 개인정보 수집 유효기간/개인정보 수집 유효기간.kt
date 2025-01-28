class Solution {
        fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
            val (todayYear, todayMonth, todayDay) = today.split(".").map { it.toInt() }
            val todayTotal = (todayYear * 12 * 28) + (todayMonth * 28) + todayDay
            val termMap = terms.associate {
                val (type, duration) = it.split(" ")
                type to duration.toInt() * 28
            }

            return privacies.mapIndexedNotNull { index, privacy ->
                val (date, type) = privacy.split(" ")
                val (year, month, day) = date.split(".").map { it.toInt() }
                val privacyTotal = (year * 12 * 28) + (month * 28) + day

                if (todayTotal >= privacyTotal + (termMap[type] ?: 0)) {
                    index + 1
                } else null
            }.toIntArray()
        }
    }