class Solution {
        fun solution(s: String, skip: String, index: Int): String {
            var answer: String = ""
            var skipChar = skip.toCharArray().map { it }
            var skippedChar = ('a'..'z').filter { it !in skipChar } 
            s.forEach {
                var newIndex = (skippedChar.indexOf(it)+index ) % skippedChar.size 
                answer += skippedChar[newIndex]
            }
            println(answer)
            return answer
        }
    }