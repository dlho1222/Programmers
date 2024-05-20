class Solution {
        fun solution(a: Int, b: Int): Int {
            var m = b / gcd(a, b)
            while (m != 1) {
                m /= if (m % 2 == 0) 2 else if (m % 5 == 0) 5 else return 2
            }
            return 1
        }

        fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a

    }