class Solution {
        fun solution(priorities: IntArray, location: Int): Int {
            data class Priority(val priority: Int, val index: Int)

            val deque = ArrayDeque<Priority>()
            priorities.forEachIndexed { idx, priority -> deque.addLast(Priority(priority, idx)) }
            var answer = 0
            while (deque.isNotEmpty()) {
                val element = deque.removeFirst()
                if (deque.any { it.priority > element.priority }) {
                    deque.addLast(element)
                } else {
                    answer++
                    if (element.index == location) return answer
                }
            }
            return answer
        }
    }