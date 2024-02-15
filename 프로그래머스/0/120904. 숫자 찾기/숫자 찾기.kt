class Solution {
        fun solution(num: Int, k: Int): Int {
            var answer: Int = -1
            var result = 0
            result = num.toString().indexOf(k.toString())
            return if (result == -1) answer else result + 1

        }
    }