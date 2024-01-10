class Solution {
        fun solution(my_string: String, queries: Array<IntArray>): String {
            var answer: String = my_string

            for (i in queries.indices) {
                answer = answer.replaceRange(
                    queries[i][0],
                    queries[i][1] + 1,
                    answer.slice(queries[i][0]..queries[i][1]).reversed()
                )
            }

            return answer
        }
    }