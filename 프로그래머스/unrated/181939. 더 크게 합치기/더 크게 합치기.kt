class Solution {
        fun solution(a: Int, b: Int): Int {
            var answer: Int = 0
            var ab = ""
            var ba = ""
            ab += a
            ab += b
            ba += b
            ba += a
            if(ab >= ba){
                answer = ab.toInt()
            }else{
                answer = ba.toInt()
            }
            return answer
        }
    }