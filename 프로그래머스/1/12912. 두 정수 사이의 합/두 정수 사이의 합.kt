class Solution {
        fun solution(a: Int, b: Int): Long =(minOf(a,b).toLong()..maxOf(a,b).toLong()).toList().sum()
    }