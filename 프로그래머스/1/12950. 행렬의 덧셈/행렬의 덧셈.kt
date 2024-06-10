class Solution {
        fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> =
            arr1.mapIndexed { index, ints ->
                ints.mapIndexed { idx, i -> i + arr2[index][idx] }.toIntArray()
            }.toTypedArray()
    }