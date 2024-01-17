class Solution {
        fun solution(arr: IntArray, query: IntArray): IntArray {
            var answer: IntArray = intArrayOf()
            var result = arr.toList()
            for (i in query.indices) {
                if (i % 2 == 0) {
                    result = result.slice(0..query[i])
                } else {
                    result = result.slice(query[i]until result.size)
                }
            }
            answer = result.toTypedArray().toIntArray()
            return answer
        }
    }