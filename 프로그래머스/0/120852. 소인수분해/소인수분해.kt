class Solution {
        fun solution(n: Int): IntArray {
            val primeList = mutableListOf<Int>()
            for (i in 2..n) {
                if (n % i == 0 && isPrime(i)) primeList.add(i)
            }
            return primeList.toIntArray()
        }

        fun isPrime(num: Int): Boolean {
            while (true) {
                var count = 0
                for (i in 1..num) {
                    if (num % i == 0) count++
                }
                return count == 2
            }
        }
    }