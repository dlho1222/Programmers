class Solution {
        fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
            val num =
                numer1 * (lcm(denom1, denom2) / denom1) + numer2 * (lcm(denom1, denom2) / denom2)
            val denom = lcm(denom1, denom2)
            val gcd = gcd(num, denom)
            val answer: IntArray = intArrayOf(num/gcd, denom/gcd)
            return answer
        }

        fun gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
        fun lcm(a: Int, b: Int): Int = (a * b) / gcd(a, b)
    }