class Solution {
        fun solution(n: Int): Int {
            var answer: Int = 0
            val list = mutableListOf<Int>()
            for (x in 2..1000000) {
                if (n % x == 1) list.add(x)
            }
            answer = list.first()
            
            return answer
        }
    }