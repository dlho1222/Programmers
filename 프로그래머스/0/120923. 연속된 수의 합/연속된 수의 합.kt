class Solution {
        fun solution(num: Int, total: Int): IntArray {
            var answer: IntArray = intArrayOf()
            val start = if(num % 2 != 0){
                (total / num) - (num/2)
            }else{
                (total / num) - (num/2-1)
            }
            answer = IntArray(num){start+it}
            return answer
        }
    }