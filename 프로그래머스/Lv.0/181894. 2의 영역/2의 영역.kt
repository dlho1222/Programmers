class Solution {
        fun solution(arr: IntArray): IntArray {
            var answer: IntArray = intArrayOf()
            if(arr.indexOf(2) == -1) answer += -1 else answer += arr.slice(arr.indexOf(2)..arr.lastIndexOf(2))
            
            return answer
        }
    }