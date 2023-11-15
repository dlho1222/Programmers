class Solution {
        fun solution(a: Int, b: Int): String {
            var answer = ""
            val dayOfWeek = listOf("FRI","SAT","SUN","MON","TUE","WED","THU")
            val lastDay = listOf(31,29,31,30,31,30,31,31,30,31,30,31)
            var day = 0
            for(i in 0 until a-1){
                day += lastDay[i]
            }
            day += b
            answer = if(day%7 == 0) "THU" else dayOfWeek[day%7-1]
            print(answer)
            return answer
        }
    }