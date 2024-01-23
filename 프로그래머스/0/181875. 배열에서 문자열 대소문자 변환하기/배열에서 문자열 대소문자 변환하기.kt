class Solution {
        fun solution(strArr: Array<String>): Array<String> {
            var answer: Array<String> = arrayOf<String>()
            for (i in strArr.indices){
                answer += if(i % 2 == 0) strArr[i].lowercase() else strArr[i].uppercase()
            }
            return answer
        }
    }