class Solution {
        fun solution(score: Array<IntArray>): IntArray {
            var answer: IntArray = IntArray(score.size) { 1 }
            for (i in score.indices) {
                for (j in score.indices) {
                    if (score[i][0] + score[i][1] < score[j][0] + score[j][1]) answer[i]++
                }
            }
            return answer
        }
    }