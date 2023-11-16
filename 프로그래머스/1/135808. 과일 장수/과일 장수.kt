class Solution {
        fun solution(k: Int, m: Int, score: IntArray): Int {
            var answer: Int = 0
            score.sortDescending()
            var lastIndex = 0
            score.forEach{
                lastIndex+=1
                if(lastIndex%m == 0){
                    answer+= it*m
                }
            }
            return answer
        }
    }