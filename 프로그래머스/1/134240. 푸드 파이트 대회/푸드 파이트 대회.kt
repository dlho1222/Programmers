class Solution {
        fun solution(food: IntArray): String {
            var answer = StringBuilder("")
            var count = 0
            for(i in 1 until food.size){
                if(food[i].div(2)>=1){
                    count = food[i].div(2)
                    for(j in 1 .. count){
                        answer.append(i)
                    }
                }
            }
            answer.append(answer.toString().reversed())
            answer.insert(answer.length.div(2),0)
          

            return answer.toString()
        }
    }