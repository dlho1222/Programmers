class Solution {
        fun solution(my_string: String): Int {
            val list = my_string.split(" ")
            var answer: Int = list.first().toInt()
            for (i in list.indices) {
                if(list[i] == "+") answer += list[i+1].toInt()
                else if(list[i] == "-") answer -= list[i+1].toInt()
            }
            return answer
        }
    }