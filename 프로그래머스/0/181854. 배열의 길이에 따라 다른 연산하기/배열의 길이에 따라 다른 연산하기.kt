class Solution {
        fun solution(arr: IntArray, n: Int): IntArray {
            var answer: IntArray = intArrayOf()
            if(arr.size % 2 == 0){
                for (i in 1 .. arr.size step 2){
                    arr[i] += n
                }
            }else{
                for (i in arr.indices step 2){
                    arr[i] += n
                }
            }
            answer = arr
            return answer
        }
    }