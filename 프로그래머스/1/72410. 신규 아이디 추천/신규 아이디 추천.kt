class Solution {
        fun solution(new_id: String): String {
            val sb = StringBuilder("")
            var lastChar: Char? = null

            for (char in new_id.lowercase()) {
                if (char in 'a'..'z' || char in '0'..'9' || char == '-' || char == '_' || char == '.') {
                    if (char == '.' && lastChar == '.') continue
                    sb.append(char)
                    lastChar = char
                }
            }

            var result = sb.toString().trim('.')
            if (result.isEmpty()) result = "a"
            if (result.length >= 16) result = result.substring(0, 15).trimEnd('.')
            while (result.length < 3) result += result.last()
            return result
        }
    }