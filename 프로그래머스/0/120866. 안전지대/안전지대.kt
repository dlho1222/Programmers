class Solution {
        fun solution(board: Array<IntArray>): Int {
            val n = board.size
            val danger = Array(n) { BooleanArray(n) }
            var safeArea = 0

            for (i in 0 until n) {
                for (j in 0 until n) {
                    if (board[i][j] == 1) {
                        for (dx in -1..1) {
                            for (dy in -1..1) {
                                val ni = i + dx
                                val nj = j + dy
                                if (ni in 0 until n && nj in 0 until n) {
                                    danger[ni][nj] = true
                                }
                            }
                        }
                    }
                }
            }
            for (i in 0 until n){
                for (j in 0 until n){
                    if(!danger[i][j]) safeArea++
                }
            }
            return safeArea
        }
    }