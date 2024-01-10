class Solution {
        fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
            var answer: IntArray = intArrayOf()
            for (i in intStrs.indices){
                if(intStrs[i].slice(s until s+l).toInt() > k ) answer += intStrs[i].slice(s until s+l).toInt()
            }
            return answer
        }
    }