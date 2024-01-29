class Solution {
        fun solution(arr: IntArray, k: Int): IntArray {
            var answer: IntArray = intArrayOf()
            for (i in arr.indices) {
                if (answer.contains(arr[i])) continue
                if (answer.size == k) break else answer += arr[i]
            }
            if (answer.size <= k) {
                for (i in arr.indices) {
                    if (answer.size == k) break else answer += -1
                }
            }
            print(answer.toList())
            return answer
        }
    }