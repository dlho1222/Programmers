class Solution {
        fun solution(num: Int): Int {
            var answer = 0
            var result = num.toLong()
            if(num == 1) answer = 0
            while (result != 1.toLong()){
                answer++
                result = if(result % 2 == 0.toLong()) result / 2 else (result * 3) + 1

            }
            if(answer > 500) answer = -1
           
            return answer
        }
    }