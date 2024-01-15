class Solution {
        fun solution(arr: IntArray, idx: Int): Int {
            var answer: Int = -1
            for (i in arr.indices){
                if(i >= idx){
                    if(arr[i] == 1){
                    
                        answer = i 
                    break
                    }
                }
            }
            print(answer)
            return answer
        }
    }