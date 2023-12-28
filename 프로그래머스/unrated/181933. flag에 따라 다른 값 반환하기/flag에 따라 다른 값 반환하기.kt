 class Solution {
        fun solution(a: Int, b: Int, flag: Boolean): Int {
            var answer: Int = 0
            answer = when(flag){
                true-> a+b

                else-> a-b
            }
            return answer
        }
    }