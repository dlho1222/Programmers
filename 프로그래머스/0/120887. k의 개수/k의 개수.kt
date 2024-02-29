class Solution {
        fun solution(i: Int, j: Int, k: Int): Int {
            var answer: Int = 0
            for (a in i..j) {
                answer += a.toString().count { it.toString().contains(k.toString()) }
            }
            return answer
        }
    }