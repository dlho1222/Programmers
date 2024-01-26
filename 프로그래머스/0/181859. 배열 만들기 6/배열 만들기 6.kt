class Solution {
        fun solution(arr: IntArray): IntArray {
            var answer = mutableListOf<Int>()
            var idx = 0
           
            while (idx < arr.size){
                if(answer.isEmpty()) {
                    answer.add(arr[idx])
                    idx++
                }else{
                    if(answer.last() == arr[idx]){
                        answer.removeLast()
                        idx++
                    }else{
                        answer.add(arr[idx])
                        idx++
                    }
                }
            }
            if(answer.isEmpty()) answer.add(-1)
            return answer.toIntArray()
        }
    }