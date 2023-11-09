class Solution {
        fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
            var answer = arrayOf<IntArray>()
            answer = arr1.mapIndexed { index, ints -> ints.mapIndexed { index2, i -> i + arr2[index][index2] }.toIntArray() }.toTypedArray()
            
            return answer
        }
    }