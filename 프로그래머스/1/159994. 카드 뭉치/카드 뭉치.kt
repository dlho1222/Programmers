class Solution {
        fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
            var answer: String = "Yes"
            var i = 0
            var j = 0
            goal.forEach {
                if(it == cards1[i]){
                    if(i < cards1.size-1){
                        i++
                    }
                }else if (it == cards2[j]){
                    if(j < cards2.size-1){
                        j++
                    }
                }else{
                    answer = "No"
                }
            }
            return answer
        }
    }