class Solution {
        fun solution(
            name: Array<String>,
            yearning: IntArray,
            photo: Array<Array<String>>
        ): IntArray {
            var answer: IntArray = intArrayOf()
            val scores = mutableMapOf<String, Int>()
            name.mapIndexed { index, s -> scores.put(s, yearning[index]) }
            answer = photo.map { row ->
                row.sumOf {
                    if (scores.containsKey(it)) scores[it]!!.toInt() else 0
                }
            }.toIntArray()
            return answer
        }
    }