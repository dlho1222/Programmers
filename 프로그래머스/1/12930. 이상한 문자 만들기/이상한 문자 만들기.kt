class Solution {
        fun solution(s: String): String {
            var answer = ""
            answer = s.split(" ").joinToString(" "){word->word.mapIndexed { index, char -> if(index % 2 == 0) char.toUpperCase() else char.lowercase() }.joinToString("")}
            return answer
        }
    }