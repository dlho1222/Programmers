class Solution {
        fun solution(code: String): String {
            val ret: StringBuilder = StringBuilder()
            var mode = false
            code.forEachIndexed { index, code ->
                if (code == '1') {
                    mode = !mode
                    return@forEachIndexed
                }
                if (!mode && index % 2 == 0) {
                    ret.append(code)
                } else if (mode && index % 2 != 0) {
                    ret.append(code)
                }
            }

            return if (ret.isEmpty()) "EMPTY" else ret.toString()
        }
    }