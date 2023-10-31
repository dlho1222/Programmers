import kotlin.math.abs
class Solution {
        fun solution(price: Int, money: Int, count: Int): Long {
            var answer: Long = 0

            for(i in 1 .. count){
              answer += price * i
            }
            if(money - answer <= 0){
                answer = abs(money-answer)
            }else{
                answer = 0 
            }
            return answer
        }
    }