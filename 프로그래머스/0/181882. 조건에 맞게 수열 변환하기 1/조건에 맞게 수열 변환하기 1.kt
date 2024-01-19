class Solution {
        fun solution(arr: IntArray): IntArray {
            for (i in arr.indices) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) arr[i] = arr[i] / 2
                else if (arr[i] % 2 != 0 && arr[i] <= 50) arr[i] = arr[i] * 2
            }
            return arr
        }
    }