class Solution {
        fun solution(food: IntArray): String {
            val result: StringBuffer = StringBuffer("")
            for (i in 1 until food.size) {
                for (j in 0 until food[i] / 2) {
                    result.append(i)
                }
            }
            result.append(0)
            for (i in food.size - 1 downTo 1) {
                for (j in 0 until food[i] / 2) {
                    result.append(i)
                }
            }
            return result.toString()
        }
    }