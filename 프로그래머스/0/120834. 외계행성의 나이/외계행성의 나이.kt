class Solution {
        fun solution(age: Int): String =
            age.toString().map { ('a'..'z').toList()[it.digitToInt()] }.joinToString("")
    }