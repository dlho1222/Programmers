import kotlin.math.ceil
class Solution {
        fun solution(progresses: IntArray, speeds: IntArray): IntArray {
            var answer = intArrayOf()
            val days = progresses.indices.map {
                ceil((100 - progresses[it]).toDouble() / speeds[it]).toInt()
            }
            var currentDay = days[0]
            var count = 1
            for (i in 1 until days.size) {
                if (currentDay >= days[i]) {
                    count++
                } else {
                    answer += count
                    currentDay = days[i]
                    count = 1
                }
                if (i == days.size - 1) {
                    answer += count
                }
            }
            return answer
        }
    }