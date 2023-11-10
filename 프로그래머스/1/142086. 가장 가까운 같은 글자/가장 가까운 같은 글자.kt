class Solution {
        fun solution(s: String): IntArray {
            var answer = IntArray(s.length, { -1 })
            val charIndexMap = mutableMapOf<Char, Int>()
            for (i in s.indices) {
                val char = s[i]
                if (charIndexMap.containsKey(char)) {
                    val lastIndex = charIndexMap[char]!!
                    val distance = i - lastIndex
                    if (answer[i] == -1 && answer[i] < distance) {
                        answer[i] = distance
                    }
                }
                charIndexMap[char] = i
            }
            
            return answer
        }
    }