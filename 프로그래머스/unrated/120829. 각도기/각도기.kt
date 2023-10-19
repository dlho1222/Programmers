class Solution {
    fun solution(angle: Int): Int {
        var answer: Int = 0
        answer = when(angle){
            in 0 until 90->1
            90->2
            in 91 until 180->3
            180->4
            else -> 0
        }
        return answer
    }
}