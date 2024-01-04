class Solution {
        fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
            var answer: IntArray = intArrayOf()

            for (i in queries.indices) {
                val temp = arr.slice(queries[i][0]..queries[i][1])
                var tempNum = temp.filter { it > queries[i][2] }
                answer += if (tempNum.isEmpty()) {
                    -1
                } else {
                    tempNum.minOrNull()!!
                }
            }
          
            return answer
        }
    }