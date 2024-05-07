class Solution {
        fun solution(arr: IntArray): Int {
            var answer: Int = 0
            while (true) {
                var count = 0
                for (i in arr.indices) {
                    if (arr[i] >= 50 && arr[i] % 2 == 0) {
                        arr[i] = arr[i] / 2
                        count++
                    } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                        arr[i] = (arr[i] * 2) + 1
                        count++
                    }
                }
                if (count == 0) break
                answer++
            }
            println(answer)
            return answer
        }
    }