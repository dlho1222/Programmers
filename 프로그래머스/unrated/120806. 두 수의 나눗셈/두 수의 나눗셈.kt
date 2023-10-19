class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        answer = ((num1.toFloat() / num2.toFloat()) * 1000).toInt()
        return answer
    }
}