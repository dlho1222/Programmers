class Solution {
        fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
            var answer: Int = 0
            val wantMap = mutableMapOf<String, Int>()
            for (i in want.indices) {
                wantMap[want[i]] = number[i]
            }
            val n = number.sum()
            for (i in 0..discount.size - n) {
                val discountMap = mutableMapOf<String, Int>()
                for (j in i until i + n) {
                    discountMap[discount[j]] = discountMap.getOrDefault(discount[j], 0) + 1
                }
                if (discountMap == wantMap) answer++
            }
            return answer
        }
    }