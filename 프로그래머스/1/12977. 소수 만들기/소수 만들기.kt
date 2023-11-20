class Solution {
        fun primeNumber(sum: Int): Boolean {
            if (sum < 2) return false
            for(i in 2 until sum){
                if(sum % i == 0) return false
            }
            return true
        }
        fun solution(nums: IntArray): Int {
            var answer = 0
            var sum = 0
            for(i in nums.indices){
                for(j in i+1 until nums.size){
                    for(k in j+1 until nums.size){
                        sum = nums[i] + nums[j] + nums[k]
                        if(primeNumber(sum)){
                            answer++
                        }
                    }
                }
            }
          
            return answer
        }
    }
    