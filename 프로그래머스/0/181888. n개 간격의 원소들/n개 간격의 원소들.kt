class Solution {
        fun solution(num_list: IntArray, n: Int): IntArray {
            var answer: IntArray = intArrayOf()
            for(i in num_list.indices step n){
                answer+= num_list[i]
            }
            return answer
        }
    }