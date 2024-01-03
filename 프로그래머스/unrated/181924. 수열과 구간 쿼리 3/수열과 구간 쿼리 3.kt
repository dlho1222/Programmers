 class Solution {
        fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
            var answer: IntArray = intArrayOf()
            for (i in queries.indices) {
                var temp = arr[queries[i][0]]
                arr[queries[i][0]] = arr[queries[i][1]]
                arr[queries[i][1]] = temp

            }
            answer = arr
            return answer
        }
    }