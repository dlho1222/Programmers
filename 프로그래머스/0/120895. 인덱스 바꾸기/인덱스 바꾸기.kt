class Solution {
        fun solution(my_string: String, num1: Int, num2: Int): String {
            val stringList = my_string.toMutableList()
            var temp: Char
            temp = stringList[num2]
            stringList[num2] = stringList[num1]
            stringList[num1] = temp
            return stringList.joinToString("")
        }
    }