class Solution {
        fun solution(left: Int, right: Int): Int =
            (left..right).sumOf { if (isPrimeEven(it)) it else -it }

        fun isPrimeEven(number: Int): Boolean {
            var cnt = 0
            for (i in 1..number) {
                if (number % i == 0) cnt++
            }
            return cnt % 2 == 0
        }
    }