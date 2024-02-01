class Solution {
        fun solution(order: Array<String>): Int {
            var answer: Int = 0
            val latte = order.filter { it.contains("latte") }.count()
            val americano = order.size - latte
            answer = (latte * 5000) + (americano * 4500)
            return answer
        }
    }