class Solution {
        fun solution(arr1: IntArray, arr2: IntArray): Int {
            var answer: Int = 0
            answer = if (arr1.size == arr2.size) {
                if (arr1.sum() == arr2.sum()) 0
                else if (arr1.sum() > arr2.sum()) 1
                else -1
            } else {
                if (arr1.size > arr2.size) 1 else -1
            }
            return answer
        }
    }