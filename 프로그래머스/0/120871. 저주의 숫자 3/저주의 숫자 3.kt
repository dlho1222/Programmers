class Solution {
        fun solution(n: Int): Int {
            var answer: Int = n
            var i = 1
            while (i <= answer) {
                if (i.toString().contains("3") || i % 3 == 0) answer++
                i++
            }
            return answer
        }
    }