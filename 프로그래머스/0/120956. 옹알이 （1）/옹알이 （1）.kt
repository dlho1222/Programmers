class Solution {
        fun solution(babbling: Array<String>): Int {
            var answer: Int = 0
            var babble = babbling.map { it.replace("aya"," ").replace("ye"," ").replace("woo", " ").replace("ma"," ")}
            answer = babble.map { it.replace(" ","") == ""}.count { it }
            return answer
        }
    }