import kotlin.math.sqrt
class Solution {
        fun solution(number: Int, limit: Int, power: Int): Int {
            var answer: Int = 0
            val attack = mutableListOf<Int>()
            var primeCount = 0
            for(i in 1..number){
                attack.add(i)
            }

            for(i in attack.indices){
                for(j in 1..sqrt(attack[i].toDouble()).toInt()){
                    if(attack[i] % j == 0){
                        primeCount+= 2
                        if(attack[i] / j == j){
                            primeCount -= 1
                        }
                    }
                }
                attack[i] = primeCount
                primeCount = 0
                if(attack[i] <= limit){
                   answer += attack[i] * 1
                }else{
                    attack[i] = power
                    answer += power * 1
                }
            }
        
            return answer
        }
    }