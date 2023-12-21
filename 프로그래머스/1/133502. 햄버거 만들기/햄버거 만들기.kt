import java.util.Stack
class Solution {
        fun solution(ingredient: IntArray): Int {
            var answer: Int = 0
            val stack = Stack<Int>()
            for (i in ingredient) {
                stack.add(i)
                if (stack.peek() == 1 && stack.size >= 4) {
                    val first = stack[stack.size - 4] == 1
                    val second = stack[stack.size - 3] == 2
                    val third = stack[stack.size - 2] == 3
                    val forth = stack[stack.size - 1] == 1
                    if (first && second && third && forth) {
                        repeat(4) { stack.pop() }
                        answer++
                    }
                }
            }
            return answer
        }
    }