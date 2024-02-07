class Solution {
        fun solution(babbling: Array<String>): Int {
            var babble = babbling.map { it.replace("aya"," ").replace("ye"," ").replace("woo", " ").replace("ma"," ")}
            return babble.map { it.replace(" ","") == ""}.count { it }
        }
    }