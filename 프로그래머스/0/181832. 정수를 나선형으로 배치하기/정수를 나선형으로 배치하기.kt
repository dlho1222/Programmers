class Solution {
        fun solution(n: Int): Array<IntArray> {
            val answer: Array<IntArray> = Array(n) { IntArray(n) }
            var num = 1
            var right = n - 1
            var left = 0
            var bottom = n - 1
            var top = 0

            while (n * n >= num) {
                for (i in left..right) {
                    answer[top][i] = num++
                }
                top++

                for (i in top..bottom) {
                    answer[i][right] = num++
                }
                right--

                for (i in right downTo left) {
                    answer[bottom][i] = num++
                }
                bottom--

                for (i in bottom downTo top) {
                    answer[i][left] = num++
                }
                left++
            }

            return answer
        }
    }