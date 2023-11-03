class Solution {
        fun solution(sizes: Array<IntArray>): Int {
            var answer: Int = 0
            var width = 0
            var height = 0
            sizes.forEach {
                width = maxOf(width,it[0], it[1])
                height = maxOf(height,if (it[0] < it[1]) it[0] else it[1])
            }
           
            answer = width * height
            return answer
        }
    }