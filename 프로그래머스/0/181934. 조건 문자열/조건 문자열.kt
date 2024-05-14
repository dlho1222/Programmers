class Solution {
        fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
            if (ineq == "<" && eq == "=") return if (n <= m) 1 else 0
            else if (ineq == ">" && eq == "=") return if (n >= m) 1 else 0
            else if (ineq == ">" && eq == "!") return if (n > m) 1 else 0
            else if (ineq == "<" && eq == "!") return if (n < m) 1 else 0
            return 0
        }
    }