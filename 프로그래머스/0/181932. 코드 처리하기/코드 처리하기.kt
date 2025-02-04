class Solution {
        fun solution(code: String): String {
            val ret: StringBuilder = StringBuilder()
            var mode = false
            for (i in code.indices) {
                val char = code[i]
                if (char == '1') {
                    mode = !mode
                    continue
                }
                if ((i % 2 == 0) != mode) {
                    ret.append(char)
                }
            }

            return if (ret.isEmpty()) "EMPTY" else ret.toString()
        }
    }