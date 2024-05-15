 class Solution {
        fun solution(numbers: IntArray, k: Int): Int {
            var answer = numbers
            var count = 0
            var result = 0
            repeat(k) {
                answer += numbers
            }
            for (i in answer.indices step 2) {
                if (count == k) break
                result = answer[i]
                count++
            }
            return result
        }
    }