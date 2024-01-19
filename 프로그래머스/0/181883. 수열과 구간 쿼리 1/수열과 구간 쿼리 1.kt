class Solution {
        fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
            for (query in queries) {
                val start = query[0]
                val end = query[1]
                for (i in start..end) {
                    arr[i]++
                }
            }
            print(arr.toList())
            return arr
        }
    }