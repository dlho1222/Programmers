 class Solution {
        fun solution(s: String, skip: String, index: Int): String {
            var answer: String = ""
            var skippedChar = ('a'..'z').filter { it !in skip }

            s.forEach {
                var newIndex = (skippedChar.indexOf(it) + index) % skippedChar.size
                answer += skippedChar[newIndex]
            }
            return answer
        }
    }