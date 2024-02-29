class Solution {
        fun solution(sides: IntArray): Int =
            if (sides.sorted()[0] + sides.sorted()[1] > sides.sorted()[2]) 1 else 2
    }