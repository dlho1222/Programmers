class Solution {
        fun solution(strings: Array<String>, n: Int): Array<String> {
            var answer = arrayOf<String>()
            answer = strings
            answer.toList().sorted()
           
            return answer.sorted().sortedBy { it[n] }.toList().toTypedArray()
        }
    }