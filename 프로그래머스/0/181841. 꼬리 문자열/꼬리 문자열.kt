class Solution {
        fun solution(str_list: Array<String>, ex: String): String {
            var answer: String = ""
            for (i in str_list.indices) {
                if (!str_list[i].contains(ex)) answer += str_list[i]
            }
            return answer
        }
    }