class Solution {
        fun solution(arr: IntArray): Int {
            var answer = 0
            answer = arr.fold(arr[0]) { acc, i -> lcd(acc, i) }
            return answer
        }

        fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
        fun lcd(a: Int, b: Int): Int = (a * b) / gcd(a, b)
    }