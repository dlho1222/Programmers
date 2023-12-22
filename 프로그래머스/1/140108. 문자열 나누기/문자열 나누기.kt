class Solution {
        fun solution(s: String): Int {
            var answer: Int = 0
            var sCnt = 0
            var nCnt = 0
            var start = ""

            for (i in s.indices){
                if(start == "") start = s[i].toString()
                if(start == s[i].toString()) sCnt++
                else nCnt++
                if(sCnt == nCnt){
                    answer++
                    start = ""
                    sCnt = 0
                    nCnt = 0
                }
            }
            if(start != "") answer++
            return answer
        }
    }