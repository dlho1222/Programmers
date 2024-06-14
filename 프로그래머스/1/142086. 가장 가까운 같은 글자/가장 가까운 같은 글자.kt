class Solution {
        fun solution(s: String): IntArray {
            var answer = IntArray(s.length) { -1 }
            val charIndexMap = mutableMapOf<Char, Int>()
            for (i in s.indices) {
                val char = s[i]
                if (charIndexMap.contains(char)) {
                    val lastIndex = charIndexMap[char]!!
                    answer[i] = i - lastIndex
                }
                charIndexMap[char] = i
            }
            return answer
        }
    }