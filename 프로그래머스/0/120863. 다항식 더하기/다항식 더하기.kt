class Solution {
        fun solution(polynomial: String): String {
            var answer: String = ""
            val constant = polynomial.replace("+", "").split(" ").filter { !it.contains("x") }
                .filter { it.isNotEmpty() }.sumOf { it.toInt() }
            var sum = 0
            polynomial.replace("+", "").split(" ").filter { it.contains("x") }
                .map { it.replace("x", "") }
                .forEach { if (it == "") sum += 1 else sum += it.toInt() }
            if (constant == 0 && sum == 1) {
                answer += "x"
            } else if (constant == 0) {
                answer += sum.toString() + "x"
            } else if (sum == 0) {
                answer += constant
            } else if (sum == 1) {
                answer += "x " + "+ " + constant
            } else {
                answer += sum.toString() + "x " + "+ " + constant
            }
            return answer
        }
    }