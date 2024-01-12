class Solution {
        fun solution(my_string: String): IntArray {
            var answer: IntArray = intArrayOf()
            val lowerCase = ('a'..'z').toList()
            val upperCase = ('A'..'Z').toList()
            val lowerArr = Array<Int>(26) { 0 }
            val upperArr = Array<Int>(26) { 0 }
            for (char in my_string) {
                val upperIndex = upperCase.indexOf(char)
                val lowerIndex = lowerCase.indexOf(char)
                if (upperIndex != -1) upperArr[upperCase.indexOf(char)]++
                if (lowerIndex != -1) lowerArr[lowerCase.indexOf(char)]++
            }
            answer = (upperArr + lowerArr).toIntArray()
            return answer
        }
    }