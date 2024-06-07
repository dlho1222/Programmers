class Solution {
        fun solution(phone_number: String): String = phone_number.replaceRange(
            0,
            phone_number.length - 4,
            "*".repeat(phone_number.length - 4)
        )
    }