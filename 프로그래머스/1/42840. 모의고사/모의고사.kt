class Solution {
        fun solution(answers: IntArray): IntArray {
            var answer = intArrayOf()
            var first = mutableListOf(1, 2, 3, 4, 5)
            var second = mutableListOf(2, 1, 2, 3, 2, 4, 2, 5)
            var third = mutableListOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
            var fCount = 0
            var sCount = 0
            var tCount = 0
            for (i in answers.indices) {
                if (answers[i] == first[i % first.size]) {
                    fCount++
                }

                if (answers[i] == second[i % second.size]) {
                    sCount++
                }
                if (answers[i] == third[i % third.size]) {
                    tCount++
                }
            }

            if (fCount >= sCount && fCount >= tCount) {
                answer += 1
            }
            if (fCount <= sCount && sCount >= tCount) {
                answer += 2
            }
            if (fCount <= tCount && tCount >= sCount) {
                answer += 3
            }
            
            return answer


        }
    }