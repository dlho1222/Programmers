class Solution {
        fun solution(myStr: String): Array<String> {
            var answer: Array<String> = arrayOf<String>()
            var str = ""
            for (i in myStr.indices){
                if(myStr[i] == 'a' || myStr[i] == 'b' || myStr[i] == 'c') {
                    answer+= str
                    str = ""
                    continue
                }
                else{
                    str += myStr[i]
                    if(i == myStr.lastIndex) answer += str
                }
            }
            answer = answer.filter { it != "" }.toTypedArray()
            if(answer.isEmpty()) answer += "EMPTY"
            return answer
        }
    }