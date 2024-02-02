class Solution {
        fun solution(myString: String): String {
            var answer: String = ""
            val char = myString.toCharArray().map { it }.toMutableList()
            for (i in char.indices){
                if(char[i].toInt() < 'l'.toInt()){
                    char[i] = 'l'
                }
            }
            answer = char.joinToString("")
           
            return answer
        }
    }