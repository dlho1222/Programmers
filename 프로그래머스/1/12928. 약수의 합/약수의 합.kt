class Solution {
        fun solution(n: Int): Int = (1..n).sumOf { if (n % it == 0) it else 0 }
    }