class Solution {
        fun solution(n: Int, a: Int, b: Int): Int {
            var playerA = a
            var playerB = b
            var round = 0
            while (playerA != playerB) {
                playerA = (playerA + 1) / 2
                playerB = (playerB + 1) / 2
                round++
            }
            return round
        }
    }