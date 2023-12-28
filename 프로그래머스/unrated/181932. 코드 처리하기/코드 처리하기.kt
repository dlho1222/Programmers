class Solution {
        fun solution(code: String): String {
            var answer: String = ""
            var mode = false
            for (i in code.indices) {
                if (code[i] == '1') {
                    mode = !mode
                    continue
                }

                if (mode) {
                    if (i % 2 != 0) {
                        answer += code[i]
                    }
                } else {
                    if (i % 2 == 0) {
                        answer += code[i]
                    }
                }
            }
            if(answer == "") answer = "EMPTY" 
            return answer
        }
    }