class Solution {
        fun solution(numbers: IntArray): Int {
            var answer: Int = 0
                for(i in 0..9){
                    if(numbers.contains(i) == false) answer+= i
                }
            
            return answer
        }
    }