class Solution {
        fun solution(schedules: IntArray, timelogs: Array<IntArray>, startday: Int): Int {
            var answer: Int = 0
            for (i in schedules.indices) {
                val schHour = schedules[i] / 100
                val schMinute = schedules[i] % 100
                val targetMinute = (schHour * 60) + schMinute + 10
                var isAllDayOnTime = true
                for (j in timelogs[i].indices) {
                    val dayOfWeek = (startday + j - 1) % 7 + 1
                    if (dayOfWeek in 1..5) {
                        val logHour = timelogs[i][j] / 100
                        val logMinute = timelogs[i][j] % 100
                        val totalMinute = logHour * 60 + logMinute
                        if (targetMinute < totalMinute) {
                            isAllDayOnTime = false
                            break
                        }
                    }
                }
                if (isAllDayOnTime) answer++
            }
            return answer
        }
    }