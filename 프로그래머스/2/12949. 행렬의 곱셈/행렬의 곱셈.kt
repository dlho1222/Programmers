class Solution {
        fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
            val answer = Array(arr1.size) { IntArray(arr2[0].size) }
            val row = arr1.size
            val rowsCol = arr1[0].size
            val arr2Col = arr2[0].size
            for (i in 0 until row) {
                for (j in 0 until arr2Col) {
                    var sum = 0
                    for (k in 0 until rowsCol) {
                        sum += arr1[i][k] * arr2[k][j]
                    }
                    answer[i][j] = sum
                }
            }
            return answer
        }
    }