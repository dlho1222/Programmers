class Solution {
        fun solution(arr: IntArray, n: Int): IntArray=
            arr.mapIndexed { index, i -> if (arr.size % 2 == 0 && index % 2 != 0) i + n else if (arr.size % 2 != 0 && index % 2 == 0) i + n else i }.toIntArray()
    }