class Solution {
        fun solution(numbers: IntArray, n: Int): Int {
            var sum = 0
            for (i in numbers){
                sum += i
                if(sum > n) break
            }
            return sum 
        }
    }