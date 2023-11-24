class Solution {
        fun solution(n: Int, m: Int, section: IntArray): Int {
            var answer: Int = 0
            var endPoint = 0
            answer = section.fold(0){count,area->
                if(endPoint<area){
                    endPoint = area + m - 1
                    count + 1
                }else{
                    count
                }
            }
            return answer
        }
    }