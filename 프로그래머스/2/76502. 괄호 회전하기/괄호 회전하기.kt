import java.util.LinkedList
import java.util.Stack

    class Solution {
        fun solution(s: String): Int {
            var answer: Int = 0
            val queue = LinkedList<Char>()
            s.forEach { queue.add(it) }
            for (i in s.indices) {
                queue.add(queue.pop())
                if (isValid(queue)) answer++
            }

            return answer
        }

        fun isValid(rotation: LinkedList<Char>): Boolean {
            val stack = Stack<Char>()
            for (char in rotation) {
                when (char) {
                    '{', '(', '[' -> stack.push(char)
                    '}' -> if (stack.isEmpty() || stack.pop() != '{') return false
                    ')' -> if (stack.isEmpty() || stack.pop() != '(') return false
                    ']' -> if (stack.isEmpty() || stack.pop() != '[') return false
                }
            }
            return stack.isEmpty()
        }
    }
