class Solution {
        fun solution(babbling: Array<String>): Int {
            var answer: Int = 0
            val words = arrayOf("aya", "ye", "woo", "ma")
            for (check in babbling) {
                var temp = check
                for (i in words.indices) {
                    if (temp.contains(words[i] + words[i])) continue
                    else temp = temp.replace(words[i], " ")
                }
                if (temp.replace(" ", "") == "") answer++
            }
            return answer
        }
    }