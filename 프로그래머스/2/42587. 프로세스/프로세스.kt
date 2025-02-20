class Solution {
        fun solution(priorities: IntArray, location: Int): Int {
            var answer = 0
            val deque = ArrayDeque<Pair<Int, Int>>()
            priorities.forEachIndexed { index, value -> deque.addLast(Pair(value, index)) }
            while (true) {
                val element = deque.removeFirst()
                if (deque.any { it.first > element.first }) {
                    deque.addLast(element)
                } else {
                    answer++
                    if (element.second == location) break
                }
            }
            return answer
        }
    }