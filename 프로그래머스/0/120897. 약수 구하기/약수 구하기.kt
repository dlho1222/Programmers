class Solution {
        fun solution(n: Int): IntArray = (1..n).filter { n % it == 0 }.toIntArray()
    }