class Solution {
        fun solution(num_list: IntArray): Int {
            var answer: Int = 0
            var multiple = 1
            var sum = 0
            for (i in num_list.indices){
                multiple *= num_list[i]
            }
            for (i in num_list.indices){
                sum += num_list[i]
            }
            if(multiple<sum*sum) answer++
            return answer
        }
    }