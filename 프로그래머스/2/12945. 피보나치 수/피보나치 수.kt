class Solution {
        fun solution(n: Int): Int {
            val fibonacci = mutableListOf(0, 1)
            for (i in 2..n) {
                fibonacci.add((fibonacci[i - 1] + fibonacci[i - 2]) % 1234567)
            }
            return fibonacci.last()
        }
    }