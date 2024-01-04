class Solution {
        fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
            

            for(i in queries.indices){
                for(j in queries[i][0]..queries[i][1]){
                    if(j % queries[i][2] == 0){
                        arr[j] += 1
                    }
                }
            }
            return arr.toTypedArray().toIntArray()
        }

    }