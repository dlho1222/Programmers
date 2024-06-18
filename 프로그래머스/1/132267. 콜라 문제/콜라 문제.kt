class Solution {
        fun solution(a: Int, b: Int, n: Int): Int {
            var answer: Int = 0
            var initCoke = n
            while (initCoke / a > 0) {
                answer += (initCoke / a) * b
                initCoke = (initCoke / a) * b + (initCoke % a)
            }
            return answer
        }
    }