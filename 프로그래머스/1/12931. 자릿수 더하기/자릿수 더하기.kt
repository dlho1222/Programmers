class Solution {
    fun solution(n: Int): Int {
        var answer = 0

        var stringList : List<String> = n.toString().toCharArray().map { it.toString() }
        answer = stringList.map { it.toInt() }.sum()
        
        return answer
    }
}