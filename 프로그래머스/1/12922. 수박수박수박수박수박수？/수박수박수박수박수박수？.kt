class Solution {
        fun solution(n: Int): String = (1..n).joinToString("") { if (it % 2 == 0) "박" else "수" }
    }