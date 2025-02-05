class Solution {
        fun solution(s: String): Int {
            var answer = 0
            val n = s.length
            for (start in 0 until n) {
                if (isValid(s, start, n)) answer++
            }
            return answer
        }

        fun isValid(s: String, start: Int, n: Int): Boolean {
            val stack = ArrayDeque<Char>()
            for (i in 0 until n) {
                val char = s[(start + i) % n]
                when (char) {
                    '{', '(', '[' -> stack.addLast(char)
                    '}' -> if (stack.isEmpty() || stack.removeLast() != '{') return false
                    ')' -> if (stack.isEmpty() || stack.removeLast() != '(') return false
                    ']' -> if (stack.isEmpty() || stack.removeLast() != '[') return false
                }
            }
            return stack.isEmpty()
        }
    }