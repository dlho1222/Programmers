class Solution {
        fun solution(numbers: IntArray): IntArray {
            var answer: IntArray = intArrayOf()
            var setList = hashSetOf<Int>()

            for (i in 0 until numbers.size) {
                for (j in 0 until numbers.size) {
                    if(i != j){
                        setList += numbers[i] + numbers[j]
                    }
                }
            }
            answer += setList.sorted()
            
            return answer
        }
    }