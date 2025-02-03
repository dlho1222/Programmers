class Solution {
        fun solution(board: Array<IntArray>): Int {
            val n = board.size
            val danger = Array(n) { BooleanArray(n) }
            val mine = mutableListOf<Pair<Int, Int>>()
            val directions = listOf(
                -1 to -1, -1 to 0, -1 to 1,
                0 to -1, 0 to 1,
                1 to -1, 1 to 0, 1 to 1
            )
            board.forEachIndexed { i, row ->
                row.forEachIndexed { j, dangerous ->
                    if (dangerous == 1) {
                        mine.add(i to j)
                    }
                }
            }

            mine.forEach { (i, j) ->

                danger[i][j] = true

                directions.forEach { (dx, dy) ->
                    val newI = i + dx
                    val newJ = j + dy
                    if (newI in 0 until n && newJ in 0 until n) {
                        danger[newI][newJ] = true
                    }
                }
            }
            
            return danger.sumOf { row ->
                row.count { !it }
            }
        }
    }