class Solution {
        fun solution(arr: IntArray, flag: BooleanArray): IntArray {
            var answer: IntArray = intArrayOf()
            val newList = mutableListOf<Int>()
            for (i in arr.indices) {
                if (flag[i]) {
                    for (j in 0 until arr[i] * 2) {
                        newList.add(arr[i])
                    }
                } else {
                    for (k in 0 until arr[i]) {
                        newList.removeLast()
                    }
                }
            }
            answer = newList.toIntArray()
            return answer
        }
    }