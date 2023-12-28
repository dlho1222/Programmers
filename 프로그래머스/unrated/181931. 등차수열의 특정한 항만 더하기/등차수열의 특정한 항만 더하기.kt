class Solution {
        fun solution(a: Int, d: Int, included: BooleanArray): Int {
            var answer: Int = 0
            var sequence = mutableListOf<Int>()
            var sum = a
            sequence.add(a)
            for (i in included.indices - 1) {
                sum += d
                sequence.add(sum)
            }
            for (i in included.indices) {
                if (included[i]) {
                    answer += sequence[i]
                }
            }
            return answer
        }
    }