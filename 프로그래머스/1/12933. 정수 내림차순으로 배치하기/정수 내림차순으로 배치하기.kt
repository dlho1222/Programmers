class Solution {
        fun solution(n: Long): Long {
            var answer: Long = 0
            val sort = n.toString().toCharArray()
            sort.sortDescending()
            answer = String(sort).toLong()
            
            return answer
        }
    }