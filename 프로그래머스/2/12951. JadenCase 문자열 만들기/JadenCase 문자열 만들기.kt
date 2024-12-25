class Solution {
        fun solution(s: String): String {
            val sb: StringBuilder = StringBuilder("")
            var isFirst = true
            for (c in s) {
                if (c == ' ') {
                    sb.append(c)
                    isFirst = true
                } else {
                    if (isFirst) {
                        sb.append(c.uppercaseChar())
                        isFirst = false
                    } else {
                        sb.append(c.lowercaseChar())
                    }
                }
            }
            return sb.toString()
        }
    }