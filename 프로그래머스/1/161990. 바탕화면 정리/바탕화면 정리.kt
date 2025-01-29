class Solution {
        fun solution(wallpaper: Array<String>): IntArray {
            var minCol = Int.MAX_VALUE
            var minRow = Int.MAX_VALUE
            var maxCol = Int.MIN_VALUE
            var maxRow = Int.MIN_VALUE

            for (i in wallpaper.indices) {
                for (j in wallpaper[i].indices) {
                    if (wallpaper[i][j] == '#') {
                        minCol = minOf(minCol, i)
                        minRow = minOf(minRow, j)
                        maxCol = maxOf(maxCol, i)
                        maxRow = maxOf(maxRow, j)
                    }
                }
            }

            return intArrayOf(minCol, minRow, maxCol + 1, maxRow + 1)
        }
    }